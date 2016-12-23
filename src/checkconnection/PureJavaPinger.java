/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkconnection;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author dsestili
 */
public class PureJavaPinger implements Pinger {

    private int timeout;
    
    public static final Long UNREACHEABLE = -1L;

    public PureJavaPinger(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public Long ping(InetAddress subject) throws IOException {
        
        long start = System.currentTimeMillis();
        boolean reachable = subject.isReachable(timeout);
        long elapsed = System.currentTimeMillis() - start;

        Long result = UNREACHEABLE;
        
        if (reachable) {
            result = elapsed;
        }

        return result;
    }

}
