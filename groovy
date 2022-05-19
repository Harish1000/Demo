def addteststep=testRunner.testCase.testSuite.testCases["TestCase 1"].testSteps["Inr 1 - Request 1"]
def contextadd=new WsdlTestRunContext(addteststep)
addteststep.run(testRunner,contextadd)


def responseContent=testRunner.testCase.testSuite.testCases["TestCase 1"].testSteps["Inr 1 - Request 1"].getPropertyValue("Response")
jsonresp = new JsonSlurper().parseText(responseContent)

def Capital=testRunner.testCase.getPropertyValue("Capital")
def ResponseCapital=jsonresp.capital[0].toString()
assert Capital==ResponseCapital
if(Capital==ResponseCapital){
	log.info "API-PASS"
}
else{
	log.info "API-FAIL"
}



