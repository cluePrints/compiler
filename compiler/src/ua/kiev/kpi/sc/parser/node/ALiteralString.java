/* This file was generated by SableCC (http://www.sablecc.org/). */

package ua.kiev.kpi.sc.parser.node;

import java.util.*;
import ua.kiev.kpi.sc.parser.analysis.*;

@SuppressWarnings("nls")
public final class ALiteralString extends PLiteralString
{
    private TDoubleQuote _doubleQuote_;
    private final LinkedList<TChar> _char_ = new LinkedList<TChar>();
    private PDoubleQuoteClosing _doubleQuoteClosing_;

    public ALiteralString()
    {
        // Constructor
    }

    public ALiteralString(
        @SuppressWarnings("hiding") TDoubleQuote _doubleQuote_,
        @SuppressWarnings("hiding") List<TChar> _char_,
        @SuppressWarnings("hiding") PDoubleQuoteClosing _doubleQuoteClosing_)
    {
        // Constructor
        setDoubleQuote(_doubleQuote_);

        setChar(_char_);

        setDoubleQuoteClosing(_doubleQuoteClosing_);

    }

    @Override
    public Object clone()
    {
        return new ALiteralString(
            cloneNode(this._doubleQuote_),
            cloneList(this._char_),
            cloneNode(this._doubleQuoteClosing_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALiteralString(this);
    }

    public TDoubleQuote getDoubleQuote()
    {
        return this._doubleQuote_;
    }

    public void setDoubleQuote(TDoubleQuote node)
    {
        if(this._doubleQuote_ != null)
        {
            this._doubleQuote_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doubleQuote_ = node;
    }

    public LinkedList<TChar> getChar()
    {
        return this._char_;
    }

    public void setChar(List<TChar> list)
    {
        this._char_.clear();
        this._char_.addAll(list);
        for(TChar e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PDoubleQuoteClosing getDoubleQuoteClosing()
    {
        return this._doubleQuoteClosing_;
    }

    public void setDoubleQuoteClosing(PDoubleQuoteClosing node)
    {
        if(this._doubleQuoteClosing_ != null)
        {
            this._doubleQuoteClosing_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doubleQuoteClosing_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._doubleQuote_)
            + toString(this._char_)
            + toString(this._doubleQuoteClosing_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._doubleQuote_ == child)
        {
            this._doubleQuote_ = null;
            return;
        }

        if(this._char_.remove(child))
        {
            return;
        }

        if(this._doubleQuoteClosing_ == child)
        {
            this._doubleQuoteClosing_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._doubleQuote_ == oldChild)
        {
            setDoubleQuote((TDoubleQuote) newChild);
            return;
        }

        for(ListIterator<TChar> i = this._char_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TChar) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._doubleQuoteClosing_ == oldChild)
        {
            setDoubleQuoteClosing((PDoubleQuoteClosing) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}