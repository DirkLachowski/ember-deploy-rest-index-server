package com.cobai.platform.appstore.web;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/revisions")
public class ApiController {

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void postRevison(@RequestBody Revision revision) {
		System.out.println(revision.id);
	}
	
	@RequestMapping(value="/{revisionId}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void activate(@PathVariable("revisionId") String revisionId) {
		System.out.println(revisionId);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<RevisionInfo> list() {
		RevisionInfo ri = new RevisionInfo();
		ri.id = "ember-app:1bdc67a";
		ri.createdOn = "2015-06-19T09:58:00-04:00";
		RevisionInfo ri2 = new RevisionInfo();
		ri.id = "ember-app:1bdc67a";
		ri.createdOn = "2015-06-29T09:58:00-04:00";
		return Arrays.asList(ri, ri2);
	}
	
	private static class Revision {
		public String id;
		public String indexHtml;
	}
	
	private static class RevisionInfo {
		public String id;
		public String createdOn;
	}
}
