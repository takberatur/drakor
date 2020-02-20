javascript: (function() {
    
    const removeElements = (elms) => elms.forEach(el => el.remove());
    removeElements( document.querySelectorAll('.alert'));

    var ctn = document.getElementsByClassName('apicodes-container');
    if (ctn.length > 0){
    var p = ctn[0].getElementsByTagName('p');
    ctn[0].removeChild(p[0]);}

    var atop = document.getElementsByClassName('share-entry');
    if (atop.length > 0){
    atop[0].parentNode.removeChild(atop[0]);}

    var tgh = document.getElementsByClassName('rt text-center');
    if (tgh.length > 0){
    tgh[0].parentNode.removeChild(tgh[0]);}

    var fbv = document.getElementsByClassName('heading2');
    if (fbv.length > 0){
    fbv[0].parentNode.removeChild(fbv[0]);}

    var lstgnr = document.getElementsByClassName('navbar-brand');
    lstgnr[0].parentNode.removeChild(lstgnr[0]);

    var socmed = document.getElementsByClassName('page-footer font-small mt-4 wow fadeIn');
    socmed[0].parentNode.removeChild(socmed[0]);

})()
