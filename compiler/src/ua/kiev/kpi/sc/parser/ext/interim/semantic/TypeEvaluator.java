package ua.kiev.kpi.sc.parser.ext.interim.semantic;

import java.util.Deque;
import java.util.Iterator;

import ua.kiev.kpi.sc.parser.ext.MyException;
import ua.kiev.kpi.sc.parser.ext.id.TypeSymbol;
import ua.kiev.kpi.sc.parser.ext.interim.InvisibleTranslation;
import ua.kiev.kpi.sc.parser.ext.interim.Translation;
import ua.kiev.kpi.sc.parser.ext.interim.repr.Literal;
import ua.kiev.kpi.sc.parser.ext.interim.repr.VariablePointer;

import com.google.common.collect.Lists;

public class TypeEvaluator{	

	public TypeSymbol evaluatePart(Deque<Translation> polizStack)
	{
		Deque<TypeSymbol> stack = Lists.newLinkedList();
		Iterator<Translation> it = polizStack.descendingIterator();
		Translation c = it.next();
		c = moveToStart(it, c);
		
		while (it.hasNext() && c != Bound.EXPR_END) {
			c = it.next();
			validate(stack, c);
		}
		
		if (stack.size() == 1) {
			return stack.pop();
		} else {
			throw new MyException("Not possible to fold result to single value");
		}
	}

	private Translation moveToStart(Iterator<Translation> it, Translation c) {
		while (it.hasNext() && (c != Bound.EXPR_START)) {
			c = it.next();
		}
		return c;
	}
	
	private void validate(Deque<TypeSymbol> stack, Translation next) {
		if (next instanceof InvisibleTranslation) {
			// do nothing
		} else if (next instanceof Evaluator){
			Evaluator e = (Evaluator) next;
			stack.push(e.validate(stack, next));
			
		} else if (next instanceof Literal) {
			Literal l = (Literal) next;
			stack.push(l.getType());
			
		} else if (next instanceof VariablePointer) {
			
		}
	}
}