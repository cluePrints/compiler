/* This file was generated by SableCC (http://www.sablecc.org/). */

package ua.kiev.kpi.sc.parser.node;

import ua.kiev.kpi.sc.parser.analysis.*;

@SuppressWarnings("nls")
public final class AAssignOperator extends POperator
{
    private PVariableName _variableName_;
    private TAssign _assign_;
    private PExpression _expression_;
    private TSemi _semi_;

    public AAssignOperator()
    {
        // Constructor
    }

    public AAssignOperator(
        @SuppressWarnings("hiding") PVariableName _variableName_,
        @SuppressWarnings("hiding") TAssign _assign_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setVariableName(_variableName_);

        setAssign(_assign_);

        setExpression(_expression_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new AAssignOperator(
            cloneNode(this._variableName_),
            cloneNode(this._assign_),
            cloneNode(this._expression_),
            cloneNode(this._semi_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignOperator(this);
    }

    public PVariableName getVariableName()
    {
        return this._variableName_;
    }

    public void setVariableName(PVariableName node)
    {
        if(this._variableName_ != null)
        {
            this._variableName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variableName_ = node;
    }

    public TAssign getAssign()
    {
        return this._assign_;
    }

    public void setAssign(TAssign node)
    {
        if(this._assign_ != null)
        {
            this._assign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assign_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._variableName_)
            + toString(this._assign_)
            + toString(this._expression_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variableName_ == child)
        {
            this._variableName_ = null;
            return;
        }

        if(this._assign_ == child)
        {
            this._assign_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._semi_ == child)
        {
            this._semi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._variableName_ == oldChild)
        {
            setVariableName((PVariableName) newChild);
            return;
        }

        if(this._assign_ == oldChild)
        {
            setAssign((TAssign) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
