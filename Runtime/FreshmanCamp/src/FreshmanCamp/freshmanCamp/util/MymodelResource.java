package FreshmanCamp.freshmanCamp.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class MymodelResource extends XMIResourceImpl {

        public MymodelResource() {
                super();
        }

        public MymodelResource(URI uri) {
                super(uri);
        }

        /* (non-Javadoc)
         * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
         */
        protected boolean useUUIDs() {
                return true;
        }
}
