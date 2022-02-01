//rename all operations
%module renamer

%rename(opSet) operator=;
%rename(opSelfMultiplication) operator*=;
%rename(opEquals) operator==;
%rename(opSubtract) operator-;
%rename(opMult) operator*;
%rename(opSquareBracket) operator[];
%rename(opAnd) operator&;
%rename(opOr) operator|;
%rename(opNot) operator~;
%rename(opUnequals) operator!=;
%rename(opPlus) operator+;
%rename(opSubtractEquals) operator-=;
%rename(opPlusEquals) operator +=;
%rename(opLessThen) operator<;
%rename(opLessEquals) operator<=;
%rename(opGreaterThen) operator>;
%rename(opGreaterEquals) operator>=;
%rename(opIncrement) operator++;
%rename(opDecrement) operator--;
%rename(opLeftShift) operator <<;
%rename(opRoundBrackets) operator();
%rename(opXOr) operator^;
