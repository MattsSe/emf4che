/*******************************************************************************
 * Copyright (c) 2012-2017 EclipseSource
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   EclipseSource - Initial implementation
 *******************************************************************************/
package org.eclipse.che.plugin.emf.ide.editor.ecore.client.jso;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import org.eclipse.che.api.promises.client.Promise;

/**
 * JavaScript overlay over Orion CodeEdit object.
 *
 * @author Artem Zatsarynnyi
 */
public class EcoreCodeEditWidgetOverlay extends JavaScriptObject {

    protected EcoreCodeEditWidgetOverlay() {
    }

    /** Creates an Orion CodeEdit widget instance. */
    public final native EcoreCodeEditWidgetOverlay create() /*-{
        return new this();
    }-*/;

    /**
     * Creates an Orion EditorView instance.
     *
     * @param element
     *         the element backing the editor view
     * @param options
     *         the editor view options
     * @return an editor view instance
     */
    public final native Promise<EcoreEditorViewOverlay> createEditorView(final Element element, final JavaScriptObject options) /*-{
        options.parent = element;
        return this.create(options);
    }-*/;
    
    /**
     * Provides Access to Orion's service registry.
     * 
     * @return the service registry
     */
    public final native EcoreServiceRegistryOverlay getServiceRegistry() /*-{
        return this.serviceRegistry;
    }-*/;
}
