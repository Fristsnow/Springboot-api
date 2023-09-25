export default class ClickBtnNav{
    constructor() {
        this.init()
    }
    init(){
        $("body").addClass("home_is_visible");

        $(".button").on("click", function () {
            $("body").toggleClass("nav_is_visible");
        });

        function removeClasses() {
            $(".menu ul li").each(function () {
                let link = $(this).find("a").attr("href");
                $("body").removeClass(link);
            });
        }

        $(".menu a").on("click", function (e) {
            e.preventDefault();
            removeClasses();
            let link = $(this).attr("href");
            $("body").addClass(link);
            $("body").removeClass("nav_is_visible");
        });
    }
}
// window.btnNav = new ClickBtnNav()
