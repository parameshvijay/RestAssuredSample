Feature: Validating Place APIs

Scenario: Verifying first place added using ADDPLACE APIs
	Given Add Place Payload
	When User calls "API" with Post method
	Then Successful response with "statuscode" = "200"
	And Check "Status" is "OK"