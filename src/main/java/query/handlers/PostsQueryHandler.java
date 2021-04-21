package query.handlers;

import query.queries.PostsQuery;
import query.queries.Query;


// Server side
public class PostsQueryHandler implements QueryHandler {

    @Override
    public void execute(Query query) {
        if (query instanceof PostsQuery) {
            uploadFromDataStorage();
        }
    }

    private void uploadFromDataStorage() {
        // store posts from data storage to posts list in PostsQuery
        //
        // as many posts as possible but with specified min/max limits
        // e.g. when server is under heavy load upload as many post as possible
        // but not lower the min value
        // when server is relatively free might send more posts but minding the
        // response time...
    }
}
