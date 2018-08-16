package latis.server

import org.scalatest.FlatSpec

class CatalogServiceSpec extends FlatSpec {

  "A dataset" should "default to using the ID as the name" in {
    val id = "id"
    val ds = Dataset(id)

    assert(ds.name == id)
  }
}
