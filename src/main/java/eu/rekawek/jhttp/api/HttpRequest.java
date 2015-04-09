package eu.rekawek.jhttp.api;

import java.io.File;

import aQute.bnd.annotation.ProviderType;

/**
 * An incoming request.
 * 
 * @author Tomasz Rękawek
 *
 */
@ProviderType
public interface HttpRequest {

    /**
     * Returns HTTP URI, representing the requested file.
     * 
     * @return HTTP URI
     */
    String getUri();

    /**
     * Get a header value by name
     * 
     * @param name Header name, case insensitive.
     * @return Header value or {@code null} if there is no such header.
     */
    String getHeaderValue(String name);

    /**
     * Uses request URI to find a requested file inside the server root directory.
     * 
     * @return Resolved file.
     */
    File resolveFile();

    /**
     * Version of the HTTP protocol, usually {@code HTTP/1.1}
     * 
     * @return HTTP version.
     */
    String getHttpVersion();

}
