package sim;

import ext_libs.*;

public class VertexClass<V> implements Vertex<V> {
	private V data;

	public VertexClass(V data) {
		super();
		this.data = data;
	}

	@Override
	public V getElement() {
		return data;
	}

}
