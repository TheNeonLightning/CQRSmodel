package query.dispatcher;

import query.queries.Query;


// Server side
public interface QueryDispatcher {
    void execute(Query query);
}
