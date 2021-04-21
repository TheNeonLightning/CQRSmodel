package query.dispatcher;

import query.handlers.QueryHandler;
import query.queries.Query;

import java.util.List;

public class QueryDispatcherImpl implements QueryDispatcher {

    List<QueryHandler> queryHandlers;

    @Override
    public void execute(Query query) {
        for (QueryHandler handler : queryHandlers) {
            handler.execute(query);
        }
    }
}
