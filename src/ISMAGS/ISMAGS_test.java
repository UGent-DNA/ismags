package ISMAGS;

/* 
 * Copyright (C) 2013 Maarten Houbraken
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Software available at https://github.com/mhoubraken/ISMAGS
 * Author : Maarten Houbraken (maarten.houbraken@intec.ugent.be)
 */

import java.io.IOException;

/**
 * Test class to show how the code can be used. Examples given can be used to
 * recreate the experiments in the paper.
 */
public class ISMAGS_test {

    public static void main(String[] args) throws IOException {
        String foldername = "networks/";
        String output = "test_3";

//        String motif = "AB0C00";
        String motif = "AC0B00";
        String linkfiles = "\"B u t t link_motif4_graph3_B.txt C u t t link_motif4_graph3_C.txt A u t t link_motif4_graph3_A.txt\"";
        System.out.println(linkfiles);

//        String motif = "i";
//        String motif = "XXX";
//        String motif = "ZYY";
//        String linkfiles = "\"P u P P example.in\"";
//        String linkfiles="\"X u A A Xu.txt Y u B B Yu.txt Z d A B Zd.txt\"";
//        		String linkfiles ="\"I u P I randomgraph-100-1000.txt\"";

//        String motif = "AA0A00";
//        String linkfiles="\"A u P I tA.txt\"";

//        String motif = "GGG";
//        String motif = "SSS";
//        String motif = "GPS";
//        String motif = "SsS";
//        String motif = "SSG";
//        String motif = "SsG";
//        String motif = "GGS";
//        String motif = "GGP";
//        String motif = "ssG";
//        String motif = "PGSPGS";
//        String motif = "P0P00PP00P000P000P0000P000P0P0000PP00000P0PP0";//peterson
//        String motif = "P0P";
//        String motif = "P0P00P";
//        String motif = "P0P00P000P";
//        String linkfiles = "\"G d t t Gu.txt P d t t Pu.txt S d t t Sd.txt\"";

//        String motif = "PPP";//3
//        String motif = "PPPPPP";//4
//        String motif = "PPPPPPPPPP";//5
//        String motif = "PPPPPPPPPPPPPPP";//6
//        String motif = "PPPPPPPPPPPPPPPPPPPPP";//7
//        String motif = "PPPPPPPPPPPPPPPPPPPPPPPPPPPP";//8
//        String motif = "PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP";//9
//        String motif = "PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP";//10
//        String linkfiles = "\"P u t t Gu.txt P u t t Pu.txt P u t t Sd.txt\"";


//        String motif = "WWW";
//        String linkfiles = "\"W u t t Wiki-Vote.txt\"";
//        String motif = "WwWWWW";
//        String linkfiles = "\"W d t t Wiki-Vote.txt\"";

//        String motif = "TTT";
//        String linkfiles = "\"T u t t p2p-Gnutella08.txt\"";
//        String motif = "TtTTTT";      
//        String linkfiles = "\"T d t t p2p-Gnutella08.txt\"";

//        String motif = "NNN";
//        String linkfiles = "\"N u t t p2p-Gnutella30.txt\"";
//        String motif = "NnNNNN";
//        String linkfiles = "\"N d t t p2p-Gnutella30.txt\"";

//        String motif = "DDD";

//        String linkfiles = "\"D u t t CA-CondMat.txt\"";
//        String motif = "DdDDDD";
//        String linkfiles = "\"D d t t CA-CondMat.txt\"";
//
//        String motif = "CCC";

//        String linkfiles = "\"C u t t CA-HepTh.txt\"";     
//        String motif = "CcCCCC";
//        String linkfiles = "\"C d t t CA-HepTh.txt\"";     

        String[] ar = new String[]{"-folder", foldername, "-linkfiles", linkfiles, "-output", foldername + output, "-motif", motif};
        CommandLineInterface.main(ar);

    }
}
