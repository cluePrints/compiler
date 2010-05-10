/* This file was generated by SableCC (http://www.sablecc.org/). */

package ua.kiev.kpi.sc.parser.node;

import ua.kiev.kpi.sc.parser.analysis.*;

@SuppressWarnings("nls")
public final class ACondOperator extends POperator
{
    private PConditionalOperator _conditionalOperator_;

    public ACondOperator()
    {
        // Constructor
    }

    public ACondOperator(
        @SuppressWarnings("hiding") PConditionalOperator _conditionalOperator_)
    {
        // Constructor
        setConditionalOperator(_conditionalOperator_);

    }

    @Override
    public Object clone()
    {
        return new ACondOperator(
            cloneNode(this._conditionalOperator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACondOperator(this);
    }

    public PConditionalOperator getConditionalOperator()
    {
        return this._conditionalOperator_;
    }

    public void setConditionalOperator(PConditionalOperator node)
    {
        if(this._conditionalOperator_ != null)
        {
            this._conditionalOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditionalOperator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conditionalOperator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._conditionalOperator_ == child)
        {
            this._conditionalOperator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._conditionalOperator_ == oldChild)
        {
            setConditionalOperator((PConditionalOperator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}