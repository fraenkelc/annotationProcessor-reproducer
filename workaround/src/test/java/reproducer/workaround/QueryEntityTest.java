package reproducer.workaround;

import reproducer.model.query.QTestEntity;

public class QueryEntityTest {
    public void queryEntity() {
        new QTestEntity().id.eq(42).findCount();
    }
}
