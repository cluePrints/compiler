/* This file was generated by SableCC (http://www.sablecc.org/). */

package ua.kiev.kpi.sc.parser.node;

import ua.kiev.kpi.sc.parser.analysis.*;

@SuppressWarnings("nls")
public final class ANumericLiteral extends PLiteral
{
    private PLiteralNumeric _literalNumeric_;

    public ANumericLiteral()
    {
        // Constructor
    }

    public ANumericLiteral(
        @SuppressWarnings("hiding") PLiteralNumeric _literalNumeric_)
    {
        // Constructor
        setLiteralNumeric(_literalNumeric_);

    }

    @Override
    public Object clone()
    {
        return new ANumericLiteral(
            cloneNode(this._literalNumeric_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumericLiteral(this);
    }

    public PLiteralNumeric getLiteralNumeric()
    {
        return this._literalNumeric_;
    }

    public void setLiteralNumeric(PLiteralNumeric node)
    {
        if(this._literalNumeric_ != null)
        {
            this._literalNumeric_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._literalNumeric_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._literalNumeric_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._literalNumeric_ == child)
        {
            this._literalNumeric_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._literalNumeric_ == oldChild)
        {
            setLiteralNumeric((PLiteralNumeric) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
