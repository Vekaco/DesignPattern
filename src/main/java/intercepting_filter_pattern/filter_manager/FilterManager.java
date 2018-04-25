package intercepting_filter_pattern.filter_manager;

import intercepting_filter_pattern.filter.Filter;
import intercepting_filter_pattern.filter_chain.FilterChain;
import intercepting_filter_pattern.target.Target;

public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String reuqest){
        filterChain.execute(reuqest);
    }


}
