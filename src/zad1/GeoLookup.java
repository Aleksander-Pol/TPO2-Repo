/**
 *
 *  @author Polański Aleksander s33173
 *
 */

package zad1;


public interface GeoLookup {
  GeoInfo lookup(String ip) throws GeoLookupException;
}
