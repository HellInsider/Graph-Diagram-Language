grammar GDL;

program: graph+ EOF;

graph: 'Graph' '{'
           (graphtitle | layout | background | saveformat | fontclr | fontsize | font )*
           content
        '}';


/*        Graph general parameters      */
layout: 'layout' ':' ('dot' | 'neato' | 'twopi' | 'circo' | 'fdp' | 'sfdp')  ';';
saveformat: 'saveAs' ':' ('png' | 'jpg')  ';';
graphtitle: 'title' ':' (TEXT | EXTENDETTEXT) ';';                                                  //change to symbols
background: 'background' ':' clr ';';
fontclr: 'fontClr' ':' clr ';';
font: 'font' ':' TEXT ';';
fontsize: 'fontSize' ':' INTEGER ';';


/*            Content part    	        */
content: (edge | vertex)+;
edge: vertex attitude vertex ( (':' edgeopt)? ('=' value)? | ('=' value)? (':' edgeopt)? ) ';';
edgeopt: '[' edgeoptparams+ ']';
edgeoptparams: ( placement | edgeclr | edgethickness) (',')?;


/*            Vertex part               */
vertex: TEXT ('(' value? ')')? vertexopt? ';'?;
value: INTEGER | TEXT | EXTENDETTEXT;                                                                              //change to symbols
attitude: ('->' | '<-' | '-');
vertexopt: '[' vertexoptparams+ ']';
vertexoptparams: ( vertexclr | vertexsize ) (',')?;



//Vertex
vertexsize: 'vertexSize' '=' INTEGER;
//vertexclr: 'vertexClr' '=' ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' | 'White' | 'Pink' | 'Cyan');
vertexclr: 'vertexClr' '=' clr;


//Edge
edgethickness: 'edgeThick' '=' INTEGER;
//edgeclr: 'edgeClr' '=' ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' | 'White' | 'Pink' | 'Cyan' | 'LightGray');
edgeclr: 'edgeClr' '=' clr;
placement: 'place' '=' ('Left' | 'Right' | 'Up' | 'Down' | 'U-L' | 'U-R' | 'D-L' | 'D-R' | 'Center');


/*          Optional parameters         */
//Graph
clr:  ('Red' | 'Green' | 'Blue' | 'Gray' | 'Yellow' | 'Black' | 'White' | 'Pink' | 'Cyan' | 'LightGray');


/*          Lexer part                  */
INTEGER: ('0'..'9')+;
TEXT: ( ('a'..'z') | ('A'..'Z') | ('0'..'9') )+;
EXTENDETTEXT: ( ('a'..'z') | ('A'..'Z') | ('0'..'9') | ( '\u0021'..'\u0027' ) | ( '*' | '+' | '.' | '/' | '-' ) | ('?' | '@') | ('\u005E'..'\u0060') | CYRILLIC)+;


//SERVICESEMBOLS: ( ( '\u0021'..'\u0027' ) | ( '\u002A'..'\u002F' ~',') | ('?' | '@') | ('\u005E'..'\u0060') )+;
CYRILLIC: (('а' .. 'я') | ('А' .. 'Я') )+;
SPACE: [ \t\r\n] -> skip;

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;