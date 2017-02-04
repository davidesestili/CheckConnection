/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkconnection;

import java.io.IOException;
import java.net.InetAddress;

public interface Pinger {
    
    public void close() throws IOException;
    public Long ping(InetAddress subject) throws IOException;

}
