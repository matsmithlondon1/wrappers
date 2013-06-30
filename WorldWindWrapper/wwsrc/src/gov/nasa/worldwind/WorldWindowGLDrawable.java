/*
 * Copyright (C) 2012 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind;

import gov.nasa.worldwind.cache.*;

import javax.media.opengl.GLAutoDrawable;

/**
 * @author tag
 * @version $Id: WorldWindowGLDrawable.java 1171 2013-02-11 21:45:02Z dcollins $
 */
public interface WorldWindowGLDrawable extends WorldWindow
{
    void initDrawable(GLAutoDrawable glAutoDrawable);

    void initGpuResourceCache(GpuResourceCache cache);

    void endInitialization();
}