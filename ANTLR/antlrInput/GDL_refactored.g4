grammar GDL;		

program: graph+ EOF;

graph: 'Graph' '{'
           graphtitle?
           layout?
           saveformat?
           edges
        '}';


/*        Graph general parameters      */
layout: 'layout:' ('dot' | 'neato' | 'twopi' | 'circo' | 'graphs' | 'fdp' | 'sfdp')  ';';
saveformat: 'saveAs:' ('png' | 'jpg')  ';';
graphtitle: 'title:' TEXT  ';';


/*            Edges part          */
edges: edge (edge | vertex)*;
edge: vertex attitude vertex ( (':' edgeopt)? ('=' value)? | ('=' value)? (':' edgeopt)? ) ';';
edgeopt: '[' edgeoptparams+ ']';
edgeoptparams: (clr | placement | size | font) (',')?;



/*            Vertex part               */
vertex: TEXT ('(' value ')')? vertexopt? ';'?;                             //Vertex is a part of edge.
value: TEXT | INTEGER;                                               //weight is text to make weight and name by one var.
attitude: ('->' | '<-' | '-');
vertexopt: '[' vertexoptparams+ ']';
vertexoptparams: (clr | size | font) (',')?;



/*          Optional parameters         */

//param: (clr | placement | size | font) (',')?;
clr: 'clr' '=' ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' ) ;
placement: 'place' '=' ('Left' | 'Right' | 'Up' | 'Down' | 'U-L' | 'U-R' | 'D-L' | 'D-R');
size: 'size' '=' INTEGER;
font: 'font' '=' TEXT;


/*          Lexer part                  */
INTEGER: ('0'..'9')+;
TEXT: (('a'..'z')|('A'..'Z')|('0'..'9'))+;
SPACE: [ \t\r\n] -> skip;