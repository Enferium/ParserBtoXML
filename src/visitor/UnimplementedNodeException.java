package visitor;

import grammaire.ParserBException;

public class UnimplementedNodeException extends ParserBException {
	private static final long serialVersionUID = 1L;

	public UnimplementedNodeException(String visitorName) {
		super("Visiteur non implémenté : " + visitorName);
	}

}
