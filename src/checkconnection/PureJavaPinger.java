/*
CheckConnection a pure java pinger
Copyright (C) 2016-2017 Davide Sestili

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package checkconnection;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author dsestili
 */
public class PureJavaPinger {

    private int timeout;
    
    public static final Long UNREACHEABLE = -1L;

    public PureJavaPinger(int timeout) {
        this.timeout = timeout;
    }

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
