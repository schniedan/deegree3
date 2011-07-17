//$HeadURL$
/*----------------------------------------------------------------------------
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2010 by:
 - Department of Geography, University of Bonn -
 and
 - lat/lon GmbH -

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option)
 any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 details.
 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation, Inc.,
 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Contact information:

 lat/lon GmbH
 Aennchenstr. 19, 53177 Bonn
 Germany
 http://lat-lon.de/

 Department of Geography, University of Bonn
 Prof. Dr. Klaus Greve
 Postfach 1147, 53001 Bonn
 Germany
 http://www.geographie.uni-bonn.de/deegree/

 e-mail: info@deegree.org
 ----------------------------------------------------------------------------*/
package org.deegree.layers;

import java.util.List;

import org.deegree.commons.utils.DoublePair;
import org.deegree.cs.coordinatesystems.ICRS;

/**
 * 
 * @author <a href="mailto:schmitz@lat-lon.de">Andreas Schmitz</a>
 * @author last edited by: $Author$
 * 
 * @version $Revision$, $Date$
 */
public class LayerMetadata {

    private String name, title, _abstract;

    // TODO proper keywords
    private List<String> keywords;

    private List<ICRS> crs;

    private DoublePair scaleDenominators;

    /**
     * @param name
     *            the name to set
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle( String title ) {
        this.title = title;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param _abstract
     *            the _abstract to set
     */
    public void set_abstract( String _abstract ) {
        this._abstract = _abstract;
    }

    /**
     * @return the _abstract
     */
    public String get_abstract() {
        return _abstract;
    }

    /**
     * @param keywords
     *            the keywords to set
     */
    public void setKeywords( List<String> keywords ) {
        this.keywords = keywords;
    }

    /**
     * @return the keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * @param crs
     *            the crs to set
     */
    public void setCoordinateSystems( List<ICRS> crs ) {
        this.crs = crs;
    }

    /**
     * @return the crs
     */
    public List<ICRS> getCoordinateSystems() {
        return crs;
    }

    /**
     * @param scaleDenominators
     *            the scaleDenominators to set, SLD style
     */
    public void setScaleDenominators( DoublePair scaleDenominators ) {
        this.scaleDenominators = scaleDenominators;
    }

    /**
     * @return the scaleDenominators, SLD style
     */
    public DoublePair getScaleDenominators() {
        return scaleDenominators;
    }

}