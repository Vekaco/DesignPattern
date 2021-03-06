package intercepting_filter_pattern.filter_chain;

import intercepting_filter_pattern.filter.Filter;
import intercepting_filter_pattern.target.Target;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request){
        for(Filter filter: filters) {
            filter.execute(request);
        }
        target.execute();
    }
}
