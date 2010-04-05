/* This file was generated by SableCC (http://www.sablecc.org/). */

package ua.kiev.kpi.sc.parser.node;

import ua.kiev.kpi.sc.parser.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleCast extends PCast
{
    private PElementalExpression _elementalExpression_;

    public ASimpleCast()
    {
        // Constructor
    }

    public ASimpleCast(
        @SuppressWarnings("hiding") PElementalExpression _elementalExpression_)
    {
        // Constructor
        setElementalExpression(_elementalExpression_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleCast(
            cloneNode(this._elementalExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleCast(this);
    }

    public PElementalExpression getElementalExpression()
    {
        return this._elementalExpression_;
    }

    public void setElementalExpression(PElementalExpression node)
    {
        if(this._elementalExpression_ != null)
        {
            this._elementalExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementalExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementalExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementalExpression_ == child)
        {
            this._elementalExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementalExpression_ == oldChild)
        {
            setElementalExpression((PElementalExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
