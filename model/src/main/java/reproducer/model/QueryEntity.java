package reproducer.model;

import reproducer.model.query.QTestEntity;

public class QueryEntity {
    public void queryEntity() {
        new QTestEntity().id.eq(42).findCount();
    }
}
