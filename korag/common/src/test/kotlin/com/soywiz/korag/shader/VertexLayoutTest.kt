package com.soywiz.korag.shader

import org.junit.Test
import kotlin.test.assertEquals

class VertexLayoutTest {
	@Test
	fun name() {
		val a1 = Attribute("a1", VarType.Byte4, normalized = false)
		val a2 = Attribute("a2", VarType.Short3, normalized = false)
		val layout = VertexLayout(a1, a2)
		assertEquals(listOf(0, 4), layout.attributePositions)
		assertEquals(10, layout.totalSize)
	}

	@Test
	fun name2() {
		val a1 = Attribute("a1", VarType.Short3, normalized = false)
		val a2 = Attribute("a2", VarType.INT(1), normalized = false)
		val layout = VertexLayout(a1, a2)
		assertEquals(listOf(0, 8), layout.attributePositions)
		assertEquals(12, layout.totalSize)
	}
}