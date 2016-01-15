package pa.iscde.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import pa.iscde.speedtext.SpeedTextExtraInfo;

public class testExtra implements SpeedTextExtraInfo {

	@Override
	public String extraInfo(String s,File file) {
		String length = s.length()+" chars";
		return length;
	}

	@Override
	public String getName() {
		return "Chars";
	}
}
