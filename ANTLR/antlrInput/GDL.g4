grammar GDL;

program: graph+ EOF;

graph: 'Graph' '{'
           (graphtitle | layout | background | saveformat)*
           content
        '}';


/*        Graph general parameters      */
layout: 'layout' ':' ('dot' | 'neato' | 'twopi' | 'circo' | 'fdp' | 'sfdp')  ';';
saveformat: 'saveAs' ':' ('png' | 'jpg')  ';';
graphtitle: 'title' ':' (TEXT | EXTENDETTEXT) ';';                                                  //change to symbols
background: 'background' ':' clr ';';


/*            Content part    	        */
content: (edge | vertex)+;
edge: vertex attitude vertex ( (':' edgeopt)? ('=' value)? | ('=' value)? (':' edgeopt)? ) ';';
edgeopt: '[' edgeoptparams+ ']';
edgeoptparams: (fontclr | placement | fontsize | font | edgeclr | edgethickness) (',')?;



/*            Vertex part               */
vertex: TEXT ('(' value? ')')? vertexopt? ';'?;
value: INTEGER | TEXT;                                                                //change to symbols
attitude: ('->' | '<-' | '-');
vertexopt: '[' vertexoptparams+ ']';
vertexoptparams: (fontclr | fontsize | font | vertexclr | vertexsize) (',')?;



/*          Optional parameters         */

clr: 'clr' '=' ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' | 'White' | 'Pink' | 'Cyan');
vertexclr: 'vertexClr' '=' ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' | 'White' | 'Pink' | 'Cyan');
edgeclr: 'edgeClr' '=' ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' | 'White' | 'Pink' | 'Cyan');
fontclr: 'fontClr' '=' ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' | 'White' | 'Pink' | 'Cyan');

placement: 'place' '=' ('Left' | 'Right' | 'Up' | 'Down' | 'U-L' | 'U-R' | 'D-L' | 'D-R' | 'Center');
edgethickness: 'edgeThick' '=' INTEGER;

fontsize: 'fontSize' '=' INTEGER;
vertexsize: 'vertexSize' '=' INTEGER;
font: 'font' '=' TEXT;


/*          Lexer part                  */
INTEGER: ('0'..'9')+;
TEXT: ( ('a'..'z') | ('A'..'Z') | ('0'..'9') )+;
EXTENDETTEXT: ( ('a'..'z') | ('A'..'Z') | ('0'..'9') | ( '\u0021'..'\u0027' ) | ( '*' | '+' | '.' | '/' ) | ('?' | '@') | ('\u005E'..'\u0060') )+;



//SERVICESEMBOLS: ( ( '\u0021'..'\u0027' ) | ( '\u002A'..'\u002F' ~',') | ('?' | '@') | ('\u005E'..'\u0060') )+;
//CYRILLIC: (('\u0400'..'\u04FF') | ('а' .. 'я') | ('А' .. 'Я') )+;
SPACE: [ \t\r\n] -> skip;

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;