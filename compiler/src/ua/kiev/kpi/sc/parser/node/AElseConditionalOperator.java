/* This file was generated by SableCC (http://www.sablecc.org/). */

package ua.kiev.kpi.sc.parser.node;

import ua.kiev.kpi.sc.parser.analysis.*;

@SuppressWarnings("nls")
public final class AElseConditionalOperator extends PConditionalOperator
{
    private PSimpleIf _simpleIf_;
    private TElse _else_;
    private TLBrc _lBrc_;
    private PBlock _block_;
    private TRBrc _rBrc_;

    public AElseConditionalOperator()
    {
        // Constructor
    }

    public AElseConditionalOperator(
        @SuppressWarnings("hiding") PSimpleIf _simpleIf_,
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") TLBrc _lBrc_,
        @SuppressWarnings("hiding") PBlock _block_,
        @SuppressWarnings("hiding") TRBrc _rBrc_)
    {
        // Constructor
        setSimpleIf(_simpleIf_);

        setElse(_else_);

        setLBrc(_lBrc_);

        setBlock(_block_);

        setRBrc(_rBrc_);

    }

    @Override
    public Object clone()
    {
        return new AElseConditionalOperator(
            cloneNode(this._simpleIf_),
            cloneNode(this._else_),
            cloneNode(this._lBrc_),
            cloneNode(this._block_),
            cloneNode(this._rBrc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElseConditionalOperator(this);
    }

    public PSimpleIf getSimpleIf()
    {
        return this._simpleIf_;
    }

    public void setSimpleIf(PSimpleIf node)
    {
        if(this._simpleIf_ != null)
        {
            this._simpleIf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleIf_ = node;
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    public TLBrc getLBrc()
    {
        return this._lBrc_;
    }

    public void setLBrc(TLBrc node)
    {
        if(this._lBrc_ != null)
        {
            this._lBrc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrc_ = node;
    }

    public PBlock getBlock()
    {
        return this._block_;
    }

    public void setBlock(PBlock node)
    {
        if(this._block_ != null)
        {
            this._block_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._block_ = node;
    }

    public TRBrc getRBrc()
    {
        return this._rBrc_;
    }

    public void setRBrc(TRBrc node)
    {
        if(this._rBrc_ != null)
        {
            this._rBrc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._simpleIf_)
            + toString(this._else_)
            + toString(this._lBrc_)
            + toString(this._block_)
            + toString(this._rBrc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._simpleIf_ == child)
        {
            this._simpleIf_ = null;
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        if(this._lBrc_ == child)
        {
            this._lBrc_ = null;
            return;
        }

        if(this._block_ == child)
        {
            this._block_ = null;
            return;
        }

        if(this._rBrc_ == child)
        {
            this._rBrc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._simpleIf_ == oldChild)
        {
            setSimpleIf((PSimpleIf) newChild);
            return;
        }

        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(this._lBrc_ == oldChild)
        {
            setLBrc((TLBrc) newChild);
            return;
        }

        if(this._block_ == oldChild)
        {
            setBlock((PBlock) newChild);
            return;
        }

        if(this._rBrc_ == oldChild)
        {
            setRBrc((TRBrc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}