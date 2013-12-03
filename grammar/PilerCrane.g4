/**
 *	Язык запросов для крана-штабелера
 */
 
grammar PilerCrane;

@header {
package org.pilercrane.language;
}

/**
 *	Правила парсера
 */
coord: 	'(' NUMBER ',' NUMBER ',' NUMBER ')';

boxCount: ALL | NUMBER;

departure: FROM (coord | HERE);
destination: (INTO coord) | HERE;

take: TAKE boxCount BOXES departure;
put: PUT boxCount BOXES destination?;
transport: TRANSPORT boxCount BOXES FROM coord INTO coord;
moveTo: MOVE_TO coord;

/**
 *	Правила лексера
 */
TAKE: 		'take';
FROM: 		'from';
BOXES: 		'boxes';
MOVE_TO: 	'move to'; 
PUT:		'put';
INTO:		'into';
ALL:		'all';
HERE:		'here';
TRANSPORT:	'transport';

fragment DIGIT: '0'..'9';
NUMBER: DIGIT+;

WS: ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ ->skip;