/*
 * $Log$
 * Revision 1.4  1999/11/26 12:16:44  apr
 * CVS devel snapshot
 *
 * Revision 1.3  1999/10/08 12:53:56  apr
 * Devel intermediate version - CVS sync
 *
 * Revision 1.2  1999/09/26 22:31:55  apr
 * CVS sync
 *
 * Revision 1.1  1999/09/26 19:54:02  apr
 * jPOS core 0.0.1 - setting up artifacts
 *
 */

package uy.com.cs.jpos.core;

import java.io.*;
import java.util.*;

/**
 * @author apr@cs.com.uy
 * @version $Id$
 * @since jPOS 1.1
 *
 * Implements financial institution specific functionality<br>
 * CardAgent may rely on <b><i>j</i>POS</b>'s ISO package
 * for the low level interchange implementation.
 */
public interface CardAgent {
    /**
     * @return agent unique ID
     */
    public int getID();

    /**
     * @return Configuration instance
     */
    public Configuration getConfiguration();

    /**
     * @param t CardTransaction
     * @return true if agent is able to handle this transaction
     */
    public boolean canHandle (CardTransaction t);

    /**
     * create a CardTransactionResponse based on a previously
     * serialized image
     * @param b agent generated image
     * @return CardTransactionResponse
     * @exception CardAgentException
     */
    public CardTransactionResponse getResponse (byte[] b) 
	throws CardAgentException;

    /**
     * Process the transaction
     * @param t previously promoted CardTransaction
     * @return CardTransactionInfo object associated with this transaction
     * @exception CardAgentException
     */
    public CardTransactionResponse process (CardTransaction t) 
	throws CardAgentException;

    /**
     * @return property prefix used in configuration
     */
    public String getPropertyPrefix();

    /**
     * Process a batch of previously completed transactions (close batch)
     * @param l List of pre-aprooved transactions
     * @return List of actually closed transactions
     * @exception CardAgentException
    public List processBatch (List l) throws CardAgentException;
     */
}
