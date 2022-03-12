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


/*            Edges parameters          */
edges: ( (vertex | vertex attitude vertex ( (':' optional)? ('=' value)? | ('=' value)? (':' optional)? ) ) ';')+ ;
vertex: TEXT ('(' value ')')? optional?;                             //Vertex is a part of edge.
value: TEXT | INTEGER;                                               //weight is text to make weight and name by one var.
attitude: ('->' | '<-' | '-');

optional: '[' param+ ']';


/*          Optional parameters         */
param: (clr | placement | size | font) (',')?;
clr: 'clr' '=' ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' ) ;
placement: 'place' '=' ('Left' | 'Right' | 'Up' | 'Down' | 'U-L' | 'U-R' | 'D-L' | 'D-R');
size: 'size' '=' INTEGER;
font: 'font' '=' TEXT;


/*          Lexer part                  */
INTEGER: ('0'..'9')+;
TEXT: (('a'..'z')|('A'..'Z')|('0'..'9'))+;
SPACE: [ \t\r\n] -> skip;