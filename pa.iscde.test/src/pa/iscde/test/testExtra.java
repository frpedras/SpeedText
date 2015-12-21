package pa.iscde.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import pa.iscde.speedtext.SpeedTextExtraInfo;

public class testExtra implements SpeedTextExtraInfo {

	@Override
	public Collection<String> extraInfo(Collection<String> list,File file) {
		System.out.println("antes: "+list.toString());
		Object[] aux = list.toArray();
		list.clear();
		for(int i=0; i<aux.length;i++){
			list.add("info"+i);
		}
		System.out.println("depois: "+list.toString());	
		return list;
	}

}
