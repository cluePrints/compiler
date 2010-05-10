/* This file was generated by SableCC (http://www.sablecc.org/). */

package ua.kiev.kpi.sc.parser.node;

import ua.kiev.kpi.sc.parser.analysis.*;

@SuppressWarnings("nls")
public final class AVariableDefinition extends PVariableDefinition
{
    private PVariableType _variableType_;
    private PVariableName _variableName_;

    public AVariableDefinition()
    {
        // Constructor
    }

    public AVariableDefinition(
        @SuppressWarnings("hiding") PVariableType _variableType_,
        @SuppressWarnings("hiding") PVariableName _variableName_)
    {
        // Constructor
        setVariableType(_variableType_);

        setVariableName(_variableName_);

    }

    @Override
    public Object clone()
    {
        return new AVariableDefinition(
            cloneNode(this._variableType_),
            cloneNode(this._variableName_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariableDefinition(this);
    }

    public PVariableType getVariableType()
    {
        return this._variableType_;
    }

    public void setVariableType(PVariableType node)
    {
        if(this._variableType_ != null)
        {
            this._variableType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variableType_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._variableType_)
            + toString(this._variableName_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variableType_ == child)
        {
            this._variableType_ = null;
            return;
        }

        if(this._variableName_ == child)
        {
            this._variableName_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._variableType_ == oldChild)
        {
            setVariableType((PVariableType) newChild);
            return;
        }

        if(this._variableName_ == oldChild)
        {
            setVariableName((PVariableName) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}