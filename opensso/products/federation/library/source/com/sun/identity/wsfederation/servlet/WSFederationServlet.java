/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2007 Sun Microsystems Inc. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * https://opensso.dev.java.net/public/CDDLv1.0.html or
 * opensso/legal/CDDLv1.0.txt
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at opensso/legal/CDDLv1.0.txt.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * $Id: WSFederationServlet.java,v 1.6 2008/08/19 19:11:17 veiming Exp $
 *
 */

package com.sun.identity.wsfederation.servlet;

import java.io.*;
import java.net.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.sun.identity.shared.debug.Debug;
import com.sun.identity.wsfederation.common.WSFederationException;
import com.sun.identity.wsfederation.common.WSFederationUtils;
import com.sun.identity.wsfederation.logging.LogUtil;
import java.util.logging.Level;

/**
 * Servlet endpoint for WS-Federation. All requests and responses flow through 
 * here.
 */
public class WSFederationServlet extends HttpServlet {
    private static Debug debug = WSFederationUtils.debug;
        
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException 
     * @throws java.io.IOException 
     */
    protected void doGet(HttpServletRequest request, 
        HttpServletResponse response)
    throws ServletException, IOException {
        String classMethod = "WSFederationServlet.doGet: ";
        
        // TODO - log request
        WSFederationAction action = 
            WSFederationActionFactory.createAction(request, response);

        if ( action == null )
        {
            debug.error("Can't create WSFederationAction");
            response.sendError(response.SC_FORBIDDEN);
            return;
        }

        try {
            action.process();
        } catch (WSFederationException wsfe ) {
            if (debug.messageEnabled()) {
                debug.message("WSFedServlet.doGet: Can't process action", wsfe);
            }
            response.sendError(response.SC_FORBIDDEN);
            return;
        }
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException 
     * @throws java.io.IOException 
     */
    protected void doPost(HttpServletRequest request, 
        HttpServletResponse response)
    throws ServletException, IOException {
        String classMethod = "WSFederationServlet.doGet: ";
        
        // TODO - log request
        WSFederationAction action = 
            WSFederationActionFactory.createAction(request, response);
        
        if ( action == null )
        {
            debug.error("Can't create WSFederationAction");
            response.sendError(response.SC_FORBIDDEN);
            return;
        }

        try {
            action.process();
        } catch (WSFederationException wsfe ) {
            if (debug.messageEnabled()) {
                debug.message("WSFedServlet.doPost:Can't process action", wsfe);
            }
            response.sendError(response.SC_FORBIDDEN);
            return;
        }
    }
    
    /** Returns a short description of the servlet.
     * @return a short description of the servlet
     */
    public String getServletInfo() {
        return "OpenSSO WS-Federation Servlet";
    }
    // </editor-fold>
}
