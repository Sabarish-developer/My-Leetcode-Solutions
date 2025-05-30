/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    
    let result = [[1], [1,1]];

    if(numRows==1) return [result[0]];
    if(numRows==2) return result;

    for(let i=3; i<=numRows; i++){
        const prevRow = result[result.length - 1];
        let newRow = [1];
        for(let j=1; j<prevRow.length; j++){
            newRow.push(prevRow[j] + prevRow[j-1]);
        }
        newRow.push(1);
        result.push(newRow);
    }
    return result;
};

/*
Time complexity - O(numrows ^ 2)
Space complexity - O(numrows ^ 2)
*/