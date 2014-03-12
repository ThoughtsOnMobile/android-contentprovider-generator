/*
 * This source is part of the     _____  ___   ____ __ / / _ \/ _ | / __/___  _______ _ /
 * // / , _/ __ |/ _/_/ _ \/ __/ _ `/ \___/_/|_/_/ |_/_/ (_)___/_/  \_, /
 *            /___/ repository.
 *
 * Copyright (C) 2012-2014 Benoit 'BoD' Lubek (BoD@JRAF.org)
 *
 * This program is free software: you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this
 * program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.thoughtsonmobile.android.contentprovider.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Model {
    private static final Model INSTANCE = new Model();

    private final List<Entity> mEntities = new ArrayList<Entity>();
    private String mHeader;

    private Model() {
    }

    public static Model get() {
        return INSTANCE;
    }

    public void addEntity(final Entity entity) {
        mEntities.add(entity);
    }

    public List<Entity> getEntities() {
        return Collections.unmodifiableList(mEntities);
    }

    public String getHeader() {
        return mHeader;
    }

    public void setHeader(final String header) {
        mHeader = header;
    }

    @Override
    public String toString() {
        return mEntities.toString();
    }
}
