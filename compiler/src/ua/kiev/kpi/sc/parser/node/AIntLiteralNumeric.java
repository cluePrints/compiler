/* This file was generated by SableCC (http://www.sablecc.org/). */

package ua.kiev.kpi.sc.parser.node;

import ua.kiev.kpi.sc.parser.analysis.*;

@SuppressWarnings("nls")
public final class AIntLiteralNumeric extends PLiteralNumeric
{
    private PInteger _integer_;

    public AIntLiteralNumeric()
    {
        // Constructor
    }

    public AIntLiteralNumeric(
        @SuppressWarnings("hiding") PInteger _integer_)
    {
        // Constructor
        setInteger(_integer_);

    }

    @Override
    public Object clone()
    {
        return new AIntLiteralNumeric(
            cloneNode(this._integer_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntLiteralNumeric(this);
    }

    public PInteger getInteger()
    {
        return this._integer_;
    }

    public void setInteger(PInteger node)
    {
        if(this._integer_ != null)
        {
            this._integer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integer_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._integer_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._integer_ == oldChild)
        {
            setInteger((PInteger) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
