package ua.kiev.kpi.sc.parser.ext.interim.semantic;

import java.util.Deque;

import org.junit.Assert;
import org.junit.Test;

import ua.kiev.kpi.sc.parser.ext.MyException;
import ua.kiev.kpi.sc.parser.ext.id.TypeSymbol;
import ua.kiev.kpi.sc.parser.ext.interim.Translation;
import ua.kiev.kpi.sc.parser.ext.interim.repr.Literal;
import ua.kiev.kpi.sc.parser.ext.interim.repr.op.Operation;

import com.google.common.collect.Lists;

public class TypeEvaluatorTest {
	@Test(expected=MyException.class)
	public void testResultExpectedSingleValue()
	{
		Deque<Translation> stack = Lists.newLinkedList();
		stack.push(new Literal("3", TypeSymbol.T_INT));
		stack.push(new Literal("5", TypeSymbol.T_INT));
		TypeEvaluator ev = new TypeEvaluator();
		ev.evaluate(stack);
	}
	
	@Test
	public void testIntIntAddition()
	{
		Deque<Translation> stack = Lists.newLinkedList();
		stack.push(new Literal("3", TypeSymbol.T_INT));
		stack.push(new Literal("5", TypeSymbol.T_INT));
		stack.push(Operation.ADD());
		TypeEvaluator ev = new TypeEvaluator();
		TypeSymbol sym = ev.evaluate(stack);
		Assert.assertTrue(sym == TypeSymbol.T_INT);
	}
	
	@Test
	public void testAllIsOk()
	{
		Deque<Translation> stack = Lists.newLinkedList();
		stack.push(new Literal("3", TypeSymbol.T_INT));
		stack.push(new Literal("5", TypeSymbol.T_FLOAT));
		stack.push(Operation.MUL());
		TypeEvaluator ev = new TypeEvaluator();
		TypeSymbol sym = ev.evaluate(stack);
		Assert.assertTrue(sym == TypeSymbol.T_FLOAT);
	}
	
	@Test(expected=Throwable.class)
	public void testOthersFail()
	{
		Deque<Translation> stack = Lists.newLinkedList();
		stack.push(new Literal("3", TypeSymbol.T_INT));
		stack.push(new Literal("5", TypeSymbol.T_STRING));
		stack.push(Operation.MUL());
		TypeEvaluator ev = new TypeEvaluator();
		ev.evaluate(stack);
	}
}
