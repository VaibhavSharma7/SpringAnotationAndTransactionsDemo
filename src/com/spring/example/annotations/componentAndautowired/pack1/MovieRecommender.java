package com.spring.example.annotations.componentAndautowired.pack1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

    @Autowired
    private MovieCatalog movieCatalog;

    @Autowired
    private com.spring.example.annotations.componentAndautowired.pack2.MovieCatalog movieCatalogPack2;

    @Autowired
    private CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    private ApplicationContext context;

    /*@Autowired can be used with any method*/
    //    @Autowired
    public void prepare(MovieCatalog movieCatalog, CustomerPreferenceDao customerPreferenceDao) {
        this.movieCatalog = movieCatalog;
        this.customerPreferenceDao = customerPreferenceDao;
    }

    /*@Autowired can be used with any setter*/
    //    @Autowired
    public void setMovieCatalog(MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
    }

    //    @Autowired
    public void setCustomerPreferenceDao(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }

    @Override
    public String toString() {
        return "MovieRecommender{" +
                "movieCatalog=" + movieCatalog +
                ", movieCatalogPack2=" + movieCatalogPack2 +
                ", customerPreferenceDao=" + customerPreferenceDao +
                ", context=" + context +
                '}';
    }
}
