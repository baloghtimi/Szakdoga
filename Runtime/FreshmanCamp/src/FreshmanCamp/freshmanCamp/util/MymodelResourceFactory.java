package FreshmanCamp.freshmanCamp.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MymodelResourceFactory extends XMIResourceFactoryImpl {

        public MymodelResourceFactory() {
                super();
        }

        /* (non-Javadoc)
         * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl#createResource(org.eclipse.emf.common.util.URI)
         */
        public Resource createResource(URI uri) {
                return new MymodelResource(uri);
        }
}