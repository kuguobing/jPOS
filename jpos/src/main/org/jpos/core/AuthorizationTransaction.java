/*
 * $Log$
 * Revision 1.2  1999/11/26 12:16:43  apr
 * CVS devel snapshot
 *
 * Revision 1.1  1999/10/08 12:53:55  apr
 * Devel intermediate version - CVS sync
 *
 * Revision 1.2  1999/09/26 22:31:58  apr
 * CVS sync
 *
 * Revision 1.1  1999/09/26 19:54:06  apr
 * jPOS core 0.0.1 - setting up artifacts
 *
 */

package uy.com.cs.jpos.core;

import java.io.*;
import java.math.*;
import java.util.*;


/**
 * @author apr@cs.com.uy
 * @version $Id$
 * @since jPOS 1.1
 *
 * @see CardTransaction
 * @see CardAgentLookup
 * @see CardHolder
 */
public class AuthorizationTransaction implements CardTransaction {
    public CardHolder cardHolder;
    public BigDecimal amount;
    public Integer currency;
    public String rrn;
    public String terminal;
    private String action;

    public AuthorizationTransaction() {
	cardHolder = null;
	amount     = null;
	rrn        = null;
	terminal   = null;
	currency   = null;
	action     = "authorize";
    }
    public void setCardHolder (CardHolder cardHolder) {
	this.cardHolder = cardHolder;
    }
    public CardHolder getCardHolder() {
	return cardHolder;
    }
    public void setAmount (BigDecimal amount) {
	this.amount = amount;
    }
    public BigDecimal getAmount() {
	return amount;
    }
    public void setCurrency (Integer currency) {
	this.currency = currency;
    }
    public void setCurrency (int m) {
	this.currency = new Integer (m);
    }
    public Integer getCurrency() {
	return currency;
    }
    public void setRRN (String rrn) {
	this.rrn = rrn;
    }
    public String getRRN() {
	return rrn;
    }
    public void setTerminal (String terminal) {
	this.terminal = terminal;
    }
    public String getTerminal () {
	return terminal;
    }
    public void setAction (String action) {
	this.action = action;
    }
    public String getAction() {
	return action;
    }
}
