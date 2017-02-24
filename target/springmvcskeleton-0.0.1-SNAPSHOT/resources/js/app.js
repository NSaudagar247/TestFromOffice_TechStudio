/**
 * 
 */
var mainApp = angular.module("mainApp", ['ngRoute']);

mainApp.config(function($routeProvider) {
	$routeProvider
		.when('/home', {
//			template:'<h1>Homepage goes here</h1>'
			templateUrl: 'modules/homepage/home.html'
//			controller: 'homeController'
		})
		.when('/admission/inquiry', {
			templateUrl: 'modules/inquiry/inquiry.html',
			controller: 'inquiryController'
		})
		.when('/blog/create', {
			templateUrl: 'modules/blog/blog.html',
			controller: 'blogController'
		})/*
		.when('/blog/detail', {
			templateUrl: 'blogs.html',
			controller: 'blogsController'
		})
		.when('/notice/create', {
			templateUrl: 'createNotice.html',
			controller: 'noticeController'
		})
		.when('/notice/detail', {
			templateUrl: 'notices.html',
			controller: 'noticeController'
		})
		.when('/faculty/create', {
			templateUrl: 'createFaculty.html',
			controller: 'facultyController'
		})
		.when('/faculty/detail', {
			templateUrl: 'faculties.html',
			controller: 'facultyController'
		})
		.when('/course/create', {
			templateUrl: 'createCourse.html',
			controller: 'courseController'
		})
		.when('/course/detail', {
			templateUrl: 'courses.html',
			controller: 'courseController'
		})*/
		.otherwise({
			redirectTo: '/home'
		});
});
