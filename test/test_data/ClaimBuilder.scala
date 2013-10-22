package test_data

import scala.xml.Elem


object ClaimBuilder {

  def goodClaim: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance CarersAllowance_Schema_0.9.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim>
          <DateOfClaim>
            <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
            <Answer>01-01-2010</Answer>
          </DateOfClaim>
          <Claimant>
            <Surname>CaseThree</Surname>
            <OtherNames>Test Middle</OtherNames>
            <OtherSurnames>Smithson</OtherSurnames>
            <Title>Mr</Title>
            <DateOfBirth>01-01-1931</DateOfBirth>
            <NationalInsuranceNumber>JB486278C</NationalInsuranceNumber>
            <Address>
              <Line>3 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <MobileNumber>0771 5419808</MobileNumber>
            <MaritalStatus>Single</MaritalStatus>
            <TextPhoneContact>
              <QuestionLabel>text.phone</QuestionLabel>
              <Answer>No</Answer>
            </TextPhoneContact>
          </Claimant>
          <Caree>
            <Surname>CaseThree</Surname>
            <OtherNames>Cloe Scott</OtherNames>
            <OtherSurnames>Watson</OtherSurnames>
            <Title>Dame</Title>
            <DateOfBirth>03-07-1953</DateOfBirth>
            <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
            <Address>
              <Line>3a Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01234 567890</DayTimePhoneNumber>
            <RelationToClaimant>
              <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
              <Answer>Mother</Answer>
            </RelationToClaimant>
            <Cared35Hours>
              <QuestionLabel>Do you spend 35 hours or more each week caring for this person?</QuestionLabel>
              <Answer>Yes</Answer>
            </Cared35Hours>
            <BreaksSinceClaim>
              <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
              <Answer>Yes</Answer>
            </BreaksSinceClaim>
            <CareBreak>
              <StartDateTime>10-07-2010 10:00</StartDateTime>
              <EndDateTime>17-07-2010 17:45</EndDateTime>
              <ReasonClaimant>
                <QuestionLabel>Where were you during the break?</QuestionLabel>
                <Other>Friend's place</Other>
                <Answer>Other</Answer>
              </ReasonClaimant>
              <ReasonCaree>
                <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
                <Answer>At Home</Answer>
              </ReasonCaree>
              <MedicalCare>
                <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
                <Answer>No</Answer>
              </MedicalCare>
            </CareBreak>
            <CareBreak>
              <StartDateTime>10-09-2010 12:00</StartDateTime>
              <EndDateTime>17-09-2010 15:15</EndDateTime>
              <ReasonClaimant>
                <QuestionLabel>Where were you during the break?</QuestionLabel>
                <Answer>Hospital</Answer>
              </ReasonClaimant>
              <ReasonCaree>
                <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
                <Answer>At Home</Answer>
              </ReasonCaree>
              <MedicalCare>
                <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
                <Answer>Yes</Answer>
              </MedicalCare>
            </CareBreak>
            <CareBreak>
              <StartDateTime>10-10-2010 10:30</StartDateTime>
            </CareBreak>
            <Cared35HoursBefore>
              <QuestionLabel>care.35.before</QuestionLabel>
              <Answer>No</Answer>
            </Cared35HoursBefore>
            <DateStartCaring>
              <QuestionLabel>care.started</QuestionLabel>
              <Answer>05-01-2010</Answer>
            </DateStartCaring>
            <LiveSameAddress>
              <QuestionLabel>caree.sameadrees</QuestionLabel>
              <Answer>Yes</Answer>
            </LiveSameAddress>
            <ArmedForcesIndependencePayment>
              <QuestionLabel>Does this person get Armed Forces Independence Payment?</QuestionLabel>
              <Answer>No</Answer>
            </ArmedForcesIndependencePayment>
          </Caree>
          <Residency>
            <NormallyLiveInGB>
              <QuestionLabel>live.normally.GB</QuestionLabel>
              <Answer>No</Answer>
            </NormallyLiveInGB>
            <CountryNormallyLive>
              <QuestionLabel>live.normally.country</QuestionLabel>
              <Answer>France</Answer>
            </CountryNormallyLive>
            <Nationality>British</Nationality>
            <TimeOutsideGBLast3Years>
              <QuestionLabel>Time.out.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </TimeOutsideGBLast3Years>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>08-09-2010</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>08-12-2010</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Other>Funeral</Other>
                <Answer>Other</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>France</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>No</Answer>
              </CareePresent>
            </PeriodAbroad>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>06-09-2011</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>06-12-2011</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Answer>Holiday</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>Spain</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>Yes</Answer>
              </CareePresent>
            </PeriodAbroad>
          </Residency>
          <CourseOfEducation>
            <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </CourseOfEducation>
          <FullTimeEducation>
            <CourseDetails>
              <Type>BA honours in Business</Type>
              <Title>Bussines Studies</Title>
              <DateStarted>
                <QuestionLabel>education.started</QuestionLabel>
                <Answer>01-01-2013</Answer>
              </DateStarted>
              <!--               <DateStopped>
                              <QuestionLabel>education.ended</QuestionLabel>
                              <Answer>2013-05-04</Answer>
                          </DateStopped>
                          -->
              <ExpectedEndDate>
                <QuestionLabel>education.end.expected</QuestionLabel>
                <Answer>05-01-2014</Answer>
              </ExpectedEndDate>
            </CourseDetails>
            <LocationDetails>
              <Name>Oxford College</Name>
              <Address>
                <Line>1 Oxford Road</Line>
                <Line>Oxford</Line>
                <Line>Oxfordshire</Line>
                <PostCode>OX12 3RT</PostCode>
              </Address>
              <PhoneNumber>01776 829920</PhoneNumber>
              <FaxNumber>01776 829920</FaxNumber>
              <StudentReferenceNumber>91982</StudentReferenceNumber>
              <Tutor>My Tutor</Tutor>
            </LocationDetails>
          </FullTimeEducation>
          <SelfEmployed>
            <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </SelfEmployed>
          <SelfEmployment>
            <SelfEmployedNow>
              <QuestionLabel>selfepmloyed.now</QuestionLabel>
              <Answer>No</Answer>
            </SelfEmployedNow>
            <RecentJobDetails>
              <DateStarted>
                <QuestionLabel>selfemployed.started</QuestionLabel>
                <Answer>05-01-2010</Answer>
              </DateStarted>
              <NatureBusiness>
                <QuestionLabel>selfemployed.business</QuestionLabel>
                <Answer>Fruit and veg, delivery service</Answer>
              </NatureBusiness>
              <TradingYear>
                <DateFrom>
                  <QuestionLabel>trading.from</QuestionLabel>
                  <Answer>05-01-2013</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>trading.to</QuestionLabel>
                  <Answer>30-04-2014</Answer>
                </DateTo>
              </TradingYear>
              <SameIncomeOutgoingLevels>
                <QuestionLabel>selfemployed.level</QuestionLabel>
                <Answer>No</Answer>
              </SameIncomeOutgoingLevels>
              <WhyWhenChange>
                <QuestionLabel>slefemployed.level.change</QuestionLabel>
                <Answer>Depends on the seasons, and productivity of the fruit.</Answer>
              </WhyWhenChange>
              <DateEnded>
                <QuestionLabel>selfemployed.ended</QuestionLabel>
                <Answer>01-09-2013</Answer>
              </DateEnded>
              <TradingCeased>
                <QuestionLabel>selfemployed.ceased</QuestionLabel>
                <Answer>Yes</Answer>
              </TradingCeased>
            </RecentJobDetails>
            <!--                <CurrentJobDetails>
                        <DateStarted>
                            <QuestionLabel>QuestionLabel34</QuestionLabel>
                            <Answer>2006-05-04</Answer>
                        </DateStarted>
                        <NatureBusiness>
                            <QuestionLabel>QuestionLabel35</QuestionLabel>
                            <Answer>Answer23</Answer>
                        </NatureBusiness>
                        <TradingYear>
                            <DateFrom>
                                <QuestionLabel>QuestionLabel36</QuestionLabel>
                                <Answer>2006-05-04</Answer>
                            </DateFrom>
                            <DateTo>
                                <QuestionLabel>QuestionLabel37</QuestionLabel>
                                <Answer>2006-05-04</Answer>
                            </DateTo>
                        </TradingYear>
                        <SameIncomeOutgoingLevels>
                            <QuestionLabel>QuestionLabel38</QuestionLabel>
                            <Answer>Yes</Answer>
                        </SameIncomeOutgoingLevels>
                        <WhyWhenChange>
                            <QuestionLabel>QuestionLabel39</QuestionLabel>
                            <Answer>Answer25</Answer>
                        </WhyWhenChange>
                    </CurrentJobDetails>-->
            <CareExpensesChildren>
              <QuestionLabel>self.child.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesChildren>
            <ChildCareExpenses>
              <CarerName>
                <QuestionLabel>self.child.carer</QuestionLabel>
                <Answer>Mr John Smith</Answer>
              </CarerName>
              <Expense>
                <Payment>
                  <QuestionLabel>self.child.care.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120.00</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>self.child.care.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Expense>
              <RelationshipCarerToClaimant>
                <QuestionLabel>self.child.rel.claimant</QuestionLabel>
                <Answer>Uncle</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToPartner>
                <QuestionLabel>self.child.rel.partner</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToPartner>
              <RelationToChild>
                <QuestionLabel>self.child.rel.child</QuestionLabel>
                <Answer>Uncle</Answer>
              </RelationToChild>
            </ChildCareExpenses>
            <CareExpensesCaree>
              <QuestionLabel>self.care.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesCaree>
            <CareExpenses>
              <CarerName>
                <QuestionLabel>self.care.carer</QuestionLabel>
                <Answer>Mrs Terry Smith</Answer>
              </CarerName>
              <Expense>
                <Payment>
                  <QuestionLabel>self.care.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>400.00</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>self.care.frequency</QuestionLabel>
                  <Other>Other expenses frequency</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Expense>
              <RelationshipCarerToClaimant>
                <QuestionLabel>self.care.rel.claimant</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToPartner>
                <QuestionLabel>self.care.rel.partner</QuestionLabel>
                <Answer>Aunt</Answer>
              </RelationshipCarerToPartner>
              <RelationshipCarerToCaree>
                <QuestionLabel>self.care.rel.caree</QuestionLabel>
                <Answer>Aunt</Answer>
              </RelationshipCarerToCaree>
            </CareExpenses>
            <PaidForPension>
              <QuestionLabel>self.pension</QuestionLabel>
              <Answer>Yes</Answer>
            </PaidForPension>
            <PensionScheme>
              <Payment>
                <QuestionLabel>self.pension.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>15.23</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>self.pension.frequency</QuestionLabel>
                <Answer>Weekly</Answer>
              </Frequency>
            </PensionScheme>
          </SelfEmployment>
          <Employed>
            <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </Employed>
          <Employment>
            <CurrentlyEmployed>
              <QuestionLabel>employed.currently</QuestionLabel>
              <Answer>Yes</Answer>
            </CurrentlyEmployed>
            <JobDetails>
              <Employer>
                <DateJobStarted>
                  <QuestionLabel>job.started</QuestionLabel>
                  <Answer>01-01-2013</Answer>
                </DateJobStarted>
                <!--        <DateJobEnded>
                                    <QuestionLabel>job.ended</QuestionLabel>
                                    <Answer>2013-07-01</Answer>
                                </DateJobEnded> -->
                <JobType>
                  <QuestionLabel>job.title</QuestionLabel>
                  <Answer>Hacker</Answer>
                </JobType>
                <ClockPayrollNumber>12345678</ClockPayrollNumber>
                <Name>Tesco's</Name>
                <Address>
                  <Line>23 Yeadon Way</Line>
                  <Line>Blackpool</Line>
                  <Line>Lancashire</Line>
                  <PostCode>FY4 5TH</PostCode>
                </Address>
                <EmployersPhoneNumber>01253 667889</EmployersPhoneNumber>
                <HaveFinishedJob>
                  <QuestionLabel>job.finished</QuestionLabel>
                  <Answer>No</Answer>
                </HaveFinishedJob>
                <!--               <P45LeavingDate>
                                    <QuestionLabel>job.p45</QuestionLabel>
                                    <Answer>2013-07-01</Answer>
                                </P45LeavingDate> -->
              </Employer>
              <Pay>
                <WeeklyHoursWorked>
                  <QuestionLabel>job.hours</QuestionLabel>
                  <Answer>25</Answer>
                </WeeklyHoursWorked>
                <DateLastPaid>
                  <QuestionLabel>job.lastpaid</QuestionLabel>
                  <Answer>02-07-2013</Answer>
                </DateLastPaid>
                <GrossPayment>
                  <QuestionLabel>job.pay</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>600.00</Amount>
                  </Answer>
                </GrossPayment>
                <IncludedInWage>
                  <QuestionLabel>job.pay.include</QuestionLabel>
                  <Answer>All amounts due</Answer>
                </IncludedInWage>
                <PayFrequency>
                  <QuestionLabel>job.pay.frequency</QuestionLabel>
                  <Answer>Four-Weekly</Answer>
                </PayFrequency>
                <UsualPayDay>
                  <QuestionLabel>job.day</QuestionLabel>
                  <Answer>Wednesday usually</Answer>
                </UsualPayDay>
                <ConstantEarnings>
                  <QuestionLabel>job.same.amount</QuestionLabel>
                  <Answer>Yes</Answer>
                </ConstantEarnings>
              </Pay>
              <OweMoney>
                <QuestionLabel>job.owe</QuestionLabel>
                <Answer>No</Answer>
              </OweMoney>
              <CareExpensesChildren>
                <QuestionLabel>chld.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesChildren>
              <ChildCareExpenses>
                <CarerName>
                  <QuestionLabel>child.carer</QuestionLabel>
                  <Answer>Mr Grandfather Senior</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>child.care.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>120.12</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>child.care.frequency</QuestionLabel>
                    <Answer>Weekly</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>child.care.rel.claimant</QuestionLabel>
                  <Answer>Father</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToPartner>
                  <QuestionLabel>cild.care.rel.partner</QuestionLabel>
                  <Answer>Stepfather</Answer>
                </RelationshipCarerToPartner>
                <RelationToChild>
                  <QuestionLabel>child.care.rel.child</QuestionLabel>
                  <Answer>Grandfather</Answer>
                </RelationToChild>
              </ChildCareExpenses>
              <CareExpensesCaree>
                <QuestionLabel>care.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesCaree>
              <CareExpenses>
                <CarerName>
                  <QuestionLabel>care.carer</QuestionLabel>
                  <Answer>Carers UK Ltd</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>care.carer.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>150.55</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>care.carer.frequency</QuestionLabel>
                    <Other>Annually</Other>
                    <Answer>Other</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>care.carer.rel.claimant</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToPartner>
                  <QuestionLabel>care.carer.rel.partner</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToPartner>
                <RelationshipCarerToCaree>
                  <QuestionLabel>care.carer.rel.caree</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToCaree>
              </CareExpenses>
              <PaidForOccupationalPension>
                <QuestionLabel>pension.occupational</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForOccupationalPension>
              <OccupationalPension>
                <Payment>
                  <QuestionLabel>pension.occ.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>350.10</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.occ.frequency</QuestionLabel>
                  <Other>Other frequency fo occupational scheme</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </OccupationalPension>
              <PaidForPersonalPension>
                <QuestionLabel>pension.personal</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForPersonalPension>
              <PersonalPension>
                <Payment>
                  <QuestionLabel>pension.per.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>200.1</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.per.frequency</QuestionLabel>
                  <Answer>Monthly</Answer>
                </Frequency>
              </PersonalPension>
              <PaidForJobExpenses>
                <QuestionLabel>job.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForJobExpenses>
              <JobExpenses>
                <Expense>
                  <QuestionLabel>job.expense</QuestionLabel>
                  <Answer>Petrol money for driving</Answer>
                </Expense>
              </JobExpenses>
              <OtherEmployment>
                <QuestionLabel>Other.eployment</QuestionLabel>
                <Answer>No</Answer>
              </OtherEmployment>
            </JobDetails>
          </Employment>
          <HavePartner>
            <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </HavePartner>
          <Partner>
            <Surname>CaseThree</Surname>
            <OtherNames>Test Middle</OtherNames>
            <OtherSurnames>Dixon</OtherSurnames>
            <Title>Mrs</Title>
            <DateOfBirth>28-09-1937</DateOfBirth>
            <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
            <!-- <Address>
                        <Line>Line4</Line>
                        <PostCode>GIR 0AA</PostCode>
                    </Address>

                    <MobileNumber>       </MobileNumber> -->
            <DayTimePhoneNumber>0987654321</DayTimePhoneNumber>
            <NationalityPartner>British</NationalityPartner>
            <RelationshipStatus>
              <SeparatedFromPartner>
                <QuestionLabel>partner.separated</QuestionLabel>
                <Answer>No</Answer>
              </SeparatedFromPartner>
            </RelationshipStatus>
            <IsCaree>
              <QuestionLabel>Is your partner/spouse the person you are claiming Carer's Allowance for?</QuestionLabel>
              <Answer>No</Answer>
            </IsCaree>
          </Partner>
          <OtherBenefits>
            <ClaimantBenefits>
              <StatePension>
                <QuestionLabel>Do you get State Pension?</QuestionLabel>
                <Answer>Yes</Answer>
              </StatePension>
            </ClaimantBenefits>
            <OtherMoneySSP>
              <QuestionLabel>ssp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySSP>
            <OtherMoneySSPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>ssp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>12</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>ssp.frequency</QuestionLabel>
                  <Other>Every day and twice on Sundays</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>Burger King</Name>
              <Address>
                <Line>102 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySSPDetails>
            <OtherMoneySP>
              <QuestionLabel>sp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySP>
            <OtherMoneySPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>sp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>sp.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Payment>
              <Name>KFC</Name>
              <Address>
                <Line>104 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySPDetails>
            <OtherMoney>
              <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoney>
            <OtherMoneyDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>Other.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>123.57</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>Other.frequency</QuestionLabel>
                  <Other>Quarterly</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>
                <QuestionLabel>Other.who</QuestionLabel>
                <Answer>The Man</Answer>
              </Name>
            </OtherMoneyDetails>
            <EEA>
              <EEAClaimPensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAClaimPensionsBenefits>
              <EEAReceivePensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAReceivePensionsBenefits>
              <EEAWorkingInsurance>
                <QuestionLabel>eea.insurance</QuestionLabel>
                <Answer>No</Answer>
              </EEAWorkingInsurance>
            </EEA>

          </OtherBenefits>
          <Payment>
            <PaymentFrequency>
              <QuestionLabel>payment.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </PaymentFrequency>
            <InitialAccountQuestion>
              <QuestionLabel>payment.way</QuestionLabel>
              <Answer>UK bank or building society</Answer>
            </InitialAccountQuestion>
            <Account>
              <HolderName>Mr Test Casetwo</HolderName>
              <BuildingSocietyDetails>
                <AccountNumber>12345678</AccountNumber>
                <!--    <RollNumber>RollNumber0</RollNumber> -->
                <SortCode>090126</SortCode>
                <Name>Santander</Name>
              </BuildingSocietyDetails>
            </Account>
          </Payment>
          <OtherInformation>
            <WelshCommunication>
              <QuestionLabel>welsh.communication</QuestionLabel>
              <Answer>No</Answer>
            </WelshCommunication>
            <AdditionalInformation>
              <QuestionLabel>anything.else</QuestionLabel>
              <Answer>It takes too long to claim. But I can write a very long answer here. 2000 characters.</Answer>
            </AdditionalInformation>
          </OtherInformation>
          <Declaration>I am the customer and have completed the form myself.</Declaration>
          <EvidenceList>
            <RecipientAddress>
              <Line>CA Freepost</Line>
              <Line>Palatine House</Line>
              <Line>Preston</Line>
              <PostCode>PR1 1HN</PostCode>
            </RecipientAddress>
            <Evidence>
              <Title>Document you need to send us</Title>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
            </Evidence>
            <Evidence>
              <Title>Pay Details</Title>
              <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
            </Evidence>
            <Evidence>
              <Title>Statement Signed</Title>
              <Content>You need to send us the completed and signed statement.</Content>
            </Evidence>
          </EvidenceList>
          <Consents>
            <Consent>
              <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
            <Consent>
              <QuestionLabel>Another consent question</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
          </Consents>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
    </DWPBody>
  }

  def badClaim: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance file:/Users/jmi/Temp/CarersAllowance_Schema.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
      </DWPCATransaction>
    </DWPBody>
  }

  def functionalTestCase1: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance file:/Users/jmi/Temp/CarersAllowance_Schema.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim id="TEST432">
          <Claimant>
            <DateOfClaim>2013-07-21</DateOfClaim>
            <Surname>Caseone</Surname>
            <OtherNames>Test</OtherNames>
            <OtherSurnames></OtherSurnames>
            <Title>mr</Title>
            <MaritalStatus>p</MaritalStatus>
            <DateOfBirth>1976-09-28</DateOfBirth>
            <NationalInsuranceNumber></NationalInsuranceNumber>
            <ExistingNationalInsuranceNumber/>
            <Address>
              <gds:Line>1 Preston Road</gds:Line> <gds:Line>Preston</gds:Line> <gds:Line></gds:Line> <gds:PostCode>PR1 1HB</gds:PostCode>
            </Address>
            <ConfirmAddress>yes</ConfirmAddress>
            <HomePhoneNumber></HomePhoneNumber>
            <DaytimePhoneNumber>
              <Number></Number>
              <Qualifier/>
            </DaytimePhoneNumber>
            <EmailAddress/>
            <ClaimedBefore>Not asked</ClaimedBefore>
          </Claimant>
          <Caree>
            <Surname>Caseone</Surname>
            <OtherNames>Test</OtherNames>
            <Title>Dame</Title>
            <DateOfBirth>1980-09-12</DateOfBirth>
            <NationalInsuranceNumber></NationalInsuranceNumber>
            <Address>
              <gds:Line>1 Preston Road</gds:Line> <gds:Line>Preston</gds:Line> <gds:Line></gds:Line> <gds:PostCode>PR1 1HB</gds:PostCode>
            </Address>
            <ConfirmAddress>yes</ConfirmAddress>
            <HomePhoneNumber/>
            <DaytimePhoneNumber>
              <Number></Number>
              <Qualifier/>
            </DaytimePhoneNumber>
            <RelationToClaimant>partner</RelationToClaimant>
            <Cared35hours>Not asked</Cared35hours>
            <CanCareeSign>Not asked</CanCareeSign>
            <CanSomeoneElseSign>Not asked</CanSomeoneElseSign>
            <CanClaimantSign>Not asked</CanClaimantSign>
            <BreaksSinceClaim>no</BreaksSinceClaim>

            <Cared35hoursBefore>Not asked</Cared35hoursBefore>
            <DateStartedCaring>2012-01-21</DateStartedCaring>
            <BreaksBeforeClaim>no</BreaksBeforeClaim>
            <PaidForCaring>Not asked</PaidForCaring>
            <ClaimedPreviously>Not asked</ClaimedPreviously>
          </Caree>
          <ClaimADI>no</ClaimADI>
          <Residency>
            <Nationality>British</Nationality>
            <EUEEASwissNational>Not asked</EUEEASwissNational>
            <CountryNormallyLive>Not asked</CountryNormallyLive>
            <CountryNormallyLiveOther>Not asked</CountryNormallyLiveOther>
            <InGreatBritainNow>yes</InGreatBritainNow>
            <InGreatBritain26Weeks>Not asked</InGreatBritain26Weeks>

            <BritishOverseasPassport>Not asked</BritishOverseasPassport>

            <OutOfGreatBritain>Not asked</OutOfGreatBritain>

          </Residency>
          <CourseOfEducation>no</CourseOfEducation>

          <SelfEmployed>no</SelfEmployed>

          <Employed>no</Employed>

          <PropertyRentedOut>
            <PayNationalInsuranceContributions/>
            <RentOutProperty>Not asked</RentOutProperty>
            <SubletHome>Not asked</SubletHome>
          </PropertyRentedOut>
          <HavePartner>no</HavePartner>

          <OtherBenefits>
            <ClaimantBenefits>
              <JobseekersAllowance>no</JobseekersAllowance>
              <IncomeSupport>no</IncomeSupport>
              <PensionCredit>no</PensionCredit>
              <StatePension>no</StatePension>
              <IncapacityBenefit>no</IncapacityBenefit>
              <SevereDisablementAllowance>no</SevereDisablementAllowance>
              <MaternityAllowance>no</MaternityAllowance>
              <UnemployabilitySupplement>no</UnemployabilitySupplement>
              <WindowsBenefit>no</WindowsBenefit>
              <WarWidowsPension>no</WarWidowsPension>
              <IndustrialDeathBenefit>no</IndustrialDeathBenefit>
              <GovernmentTrainingAllowance>no</GovernmentTrainingAllowance>
              <LoneParentChildBenefit>no</LoneParentChildBenefit>
              <OtherSocialSecurityBenefit>Not asked</OtherSocialSecurityBenefit>
              <NonSocialSecurityBenefit>Not asked</NonSocialSecurityBenefit>
              <NoBenefits>Not asked</NoBenefits>
            </ClaimantBenefits>
            <PartnerBenefits>
              <JobseekersAllowance>no</JobseekersAllowance>
              <IncomeSupport>no</IncomeSupport>
              <PensionCredit>no</PensionCredit>
              <StatePension>no</StatePension>
              <IncapacityBenefit>no</IncapacityBenefit>
              <SevereDisablementAllowance>no</SevereDisablementAllowance>
              <MaternityAllowance>no</MaternityAllowance>
              <UnemployabilitySupplement>no</UnemployabilitySupplement>
              <WindowsBenefit>no</WindowsBenefit>
              <WarWidowsPension>no</WarWidowsPension>
              <IndustrialDeathBenefit>no</IndustrialDeathBenefit>
              <GovernmentTrainingAllowance>no</GovernmentTrainingAllowance>
              <OtherSocialSecurityBenefit>Not asked</OtherSocialSecurityBenefit>
              <NonSocialSecurityBenefit>Not asked</NonSocialSecurityBenefit>
              <NoBenefits>Not asked</NoBenefits>
            </PartnerBenefits>
            <ExtraMoney>Not asked</ExtraMoney>
            <OtherMoneySSP>no</OtherMoneySSP>
            <OtherMoneySMP>no</OtherMoneySMP>
          </OtherBenefits>
          <Payment>
            <PaymentFrequency>Not asked</PaymentFrequency>
            <InitialAccountQuestion>Not asked</InitialAccountQuestion>

          </Payment>
          <OtherInformation/>
          <ThirdParty>no</ThirdParty>
          <Declaration>


            <TextLine>Do you agree to us getting information from any other person or organisation you have told us about as part of this claim? Yes</TextLine>


            <TextLine>This is my claim for Carer's Allowance.</TextLine>
            <TextLine>I understand that if I am paid Carer's Allowance it may affect the benefits paid to Test Caseone.</TextLine>
            <TextLine>If the person you are caring for receives certain benefits, the amount they receive may be affected by your claim for Carer's Allowance. Because of this we need both of you to understand the potential consequences of your claim to Carer's Allowance.</TextLine>
            <TextLine>If Test Caseone gets a Severe Disability Premium with their income-based Jobseeker's Allowance, Income Support, income-related Employment and Support Allowance, Housing Benefit, they may no longer get that premium if we pay Carer's Allowance to you.</TextLine>
            <TextLine>If Test Caseone's Pension Credit includes an extra amount for severe disability, they may no longer get that extra amount if we pay Carer's Allowance to you.</TextLine>
            <TextLine>This could also affect any reduction in Council Tax Test Caseone may be entitled to. To find out more about it, please contact the Local Authority.</TextLine>
            <TextLine>We will need to check Test Caseone entitlement to Disability Living Allowance, Personal Independence Payment, Attendance Allowance, Constant Attendance Allowance or Armed Forces Independence Payment when considering your claim.</TextLine>
            <TextLine>We may contact Test Caseone or their representative to establish whether 35 hours caring per week is taking place.</TextLine>
            <TextLine></TextLine>
            <TextLine>Please tick this box to declare that you have understood the notes and you have made / will make the person you are caring for / or their representative aware that there could be a change to their benefits. = yes</TextLine>

            <TextLine>I declare that I understand the Carer's Allowance Claim Notes and that the information provided on this claim form is correct and complete.</TextLine>
            <TextLine>I understand that I must report all changes in my circumstances or that of the person that I am caring for which may affect my entitlement promptly and by failing to do so I may be liable to prosecution or face a financial penalty.</TextLine>
            <TextLine>I will phone 08456084321 or write to Carer's Allowance Unit, Palatine House, Preston, Lancaster, PR1 1HB to report a change in my circumstances or that of the person that I am caring for.</TextLine>
            <TextLine>If I give false or incomplete information or fail to report changes in my circumstances or that of the person that I am caring for promptly, I understand that my Carer's Allowance may be stopped or reduced and any overpayment of Carer's Allowance may be recovered. In addition I may be prosecuted or face a financial penalty.</TextLine>
            <TextLine>We may wish to contact any current or previous employers, or other persons or organisations you have listed on this claim form to obtain information about your claim. You do not have to agree to this but if you do not, it may mean that we are unable to obtain enough information to satisfy ourselves that you meet the conditions of entitlement for your claim.</TextLine>
            <TextLine></TextLine>
            <TextLine>Please tick this box to confirm that you understand and make the declarations above. = yes</TextLine>
            <TextLine>Please tick this box if this claim form has been filled in by someone else, if so, please ensure that you understand the declarations above as another person cannot make the declarations on your behalf. = yes</TextLine>

            <TextLine>Do you live in Wales and would like to receive future communications in Welsh? No</TextLine>
          </Declaration>
          <EvidenceList>
            <TextLine>
              XML Generated at: 2013-10-16T11:51:11
            </TextLine> <TextLine>
            ======================About You======================
          </TextLine> <TextLine>
            Have you always lived in the UK? = Yes
          </TextLine> <TextLine/>
            <TextLine/> <TextLine>
            Do you get state Pension? = Yes
          </TextLine> <TextLine/> <TextLine>
            ================About Care You Provide================
          </TextLine> <TextLine>
            Do they live at the same address as you? = Yes
          </TextLine> <TextLine>
            Does this person get Armed Forces Independence Payment? = Yes
          </TextLine> <TextLine>
            Do you spend 35 hours or more each week caring for this person? = Yes
          </TextLine> <TextLine>
            Did you care for this person for 35 hours or more each week before your claim date ? = Yes
          </TextLine> <TextLine>
            =====================Time abroad=====================
          </TextLine> <TextLine>
            Do you normally live in the UK, Republic of Ireland, Isle of Man or the Channel Islands? = Yes
          </TextLine> <TextLine>
            Have you had any more trips out of Great Britain for more than 52 weeks at a time, since 21/07/2013 (this is 156 weeks before your claim date)? = No
          </TextLine> <TextLine>
            Have you been out of Great Britain with the person you care for, for more than four weeks at a time, since 21/07/2013 (this is 3 years before your claim date)? = No
          </TextLine> <TextLine>
            =====================Other Money=====================
          </TextLine> <TextLine>
            Have you
            &lt;
            or your partner/spouse
            &gt;
            claimed or received any other benefits since the date you want to claim? = No
          </TextLine> <TextLine>
            Have you received any payments for the person you care for or any other person since your claim date? = No
          </TextLine> <TextLine/>
            <TextLine/>
            <TextLine/>
            <TextLine/>
            <TextLine/>
            <TextLine/>
            <TextLine/>
            <TextLine/>
            <TextLine/>
            <TextLine/> <TextLine>
            Are you, your wife, husband, civil partner or parent you are dependent on, receiving any pensions or benefits from another EEA State or Switzerland? = No
          </TextLine> <TextLine>
            Are you, your wife, husband, civil partner or parent you are dependent on working in or paying insurance to another EEA State or Switzerland? = No
          </TextLine>
          </EvidenceList>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
    </DWPBody>
  }

  def functionalTestCase2: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance CarersAllowance_Schema_0.9.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim>
          <DateOfClaim>
            <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
            <Answer>01-01-2010</Answer>
          </DateOfClaim>
          <Claimant>
            <Surname>CaseTwo</Surname>
            <OtherNames>Test Middle</OtherNames>
            <OtherSurnames>Johnson</OtherSurnames>
            <Title>Rev</Title>
            <DateOfBirth>01-01-1931</DateOfBirth>
            <NationalInsuranceNumber>JA486278A</NationalInsuranceNumber>
            <Address>
              <Line>2 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <MaritalStatus>Widowed or surviving civil partner</MaritalStatus>
            <TextPhoneContact>
              <QuestionLabel>text.phone</QuestionLabel>
              <Answer>No</Answer>
            </TextPhoneContact>
          </Claimant>
          <Caree>
            <Surname>For</Surname>
            <OtherNames>Person Cared</OtherNames>
            <OtherSurnames>Watson</OtherSurnames>
            <Title>Mr</Title>
            <DateOfBirth>03-7-1953</DateOfBirth>
            <NationalInsuranceNumber>JA789871C</NationalInsuranceNumber>
            <Address>
              <Line>12 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 998761</DayTimePhoneNumber>
            <RelationToClaimant>
              <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
              <Answer>Father</Answer>
            </RelationToClaimant>
            <Cared35Hours>
              <QuestionLabel>Do you spend 35 hours or more each week caring for this person?</QuestionLabel>
              <Answer>No</Answer>
            </Cared35Hours>
            <BreaksSinceClaim>
              <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
              <Answer>No</Answer>
            </BreaksSinceClaim>

            <Cared35HoursBefore>
              <QuestionLabel>care.35.before</QuestionLabel>
              <Answer>No</Answer>
            </Cared35HoursBefore>
            <DateStartCaring>
              <QuestionLabel>care.started</QuestionLabel>
              <Answer>2010-05-01</Answer>
            </DateStartCaring>
            <LiveSameAddress>
              <QuestionLabel>caree.sameadrees</QuestionLabel>
              <Answer>Yes</Answer>
            </LiveSameAddress>
            <ArmedForcesIndependencePayment>
              <QuestionLabel>Does this person get Armed Forces Independence Payment?</QuestionLabel>
              <Answer>No</Answer>
            </ArmedForcesIndependencePayment>
          </Caree>
          <Residency>
            <NormallyLiveInGB>
              <QuestionLabel>live.normally.GB</QuestionLabel>
              <Answer>No</Answer>
            </NormallyLiveInGB>
            <CountryNormallyLive>
              <QuestionLabel>live.normally.country</QuestionLabel>
              <Answer>France</Answer>
            </CountryNormallyLive>
            <Nationality>British</Nationality>
            <TimeOutsideGBLast3Years>
              <QuestionLabel>Time.out.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </TimeOutsideGBLast3Years>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>2011-06-09</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>2011-06-12</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Answer>Holiday</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>Spain</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>Yes</Answer>
              </CareePresent>
            </PeriodAbroad>
          </Residency>
          <CourseOfEducation>
            <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </CourseOfEducation>
          <FullTimeEducation>
            <CourseDetails>
              <Type>BA honours in Business</Type>
              <Title>Bussines Studies</Title>
              <DateStarted>
                <QuestionLabel>education.started</QuestionLabel>
                <Answer>2013-01-01</Answer>
              </DateStarted>
              <!--               <DateStopped>
                              <QuestionLabel>education.ended</QuestionLabel>
                              <Answer>2013-05-04</Answer>
                          </DateStopped>
                          -->
              <ExpectedEndDate>
                <QuestionLabel>education.end.expected</QuestionLabel>
                <Answer>2014-05-01</Answer>
              </ExpectedEndDate>
            </CourseDetails>
            <LocationDetails>
              <Name>Oxford College</Name>
              <Address>
                <Line>1 Oxford Road</Line>
                <Line>Oxford</Line>
                <Line>Oxfordshire</Line>
                <PostCode>OX12 3RT</PostCode>
              </Address>
              <PhoneNumber>01776 829920</PhoneNumber>
              <FaxNumber>01776 829920</FaxNumber>
              <StudentReferenceNumber>91982</StudentReferenceNumber>
              <Tutor>My Tutor</Tutor>
            </LocationDetails>
          </FullTimeEducation>
          <SelfEmployed>
            <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
            <Answer>No</Answer>
          </SelfEmployed>

          <Employed>
            <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
            <Answer>No</Answer>
          </Employed>

          <HavePartner>
            <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </HavePartner>
          <Partner>
            <Surname>CaseTwo</Surname>
            <OtherNames>Test Middle</OtherNames>
            <OtherSurnames>Dixon</OtherSurnames>
            <Title>Mrs</Title>
            <DateOfBirth>1977-09-28</DateOfBirth>
            <NationalInsuranceNumber>JA234567B</NationalInsuranceNumber>
            <!-- <Address>
                        <Line>Line4</Line>
                        <PostCode>GIR 0AA</PostCode>
                    </Address>

                    <MobileNumber>       </MobileNumber> -->
            <DayTimePhoneNumber>0987654321</DayTimePhoneNumber>
            <NationalityPartner>British</NationalityPartner>
            <RelationshipStatus>
              <SeparatedFromPartner>
                <QuestionLabel>partner.separated</QuestionLabel>
                <Answer>No</Answer>
              </SeparatedFromPartner>
            </RelationshipStatus>
            <IsCaree>
              <QuestionLabel>Is your partner/spouse the person you are claiming Carer's Allowance for?</QuestionLabel>
              <Answer>No</Answer>
            </IsCaree>
          </Partner>
          <OtherBenefits>
            <ClaimantBenefits>
              <StatePension>
                <QuestionLabel>Do you get State Pension?</QuestionLabel>
                <Answer>No</Answer>
              </StatePension>
            </ClaimantBenefits>

            <OtherMoneySSPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>ssp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>12</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>ssp.frequency</QuestionLabel>
                  <Other>Every day and twice on Sundays</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>Burger King</Name>
              <Address>
                <Line>102 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySSPDetails>
            <OtherMoneySP>
              <QuestionLabel>sp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySP>

            <OtherMoney>
              <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoney>
            <OtherMoneyDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>Other.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>123.57</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>Other.frequency</QuestionLabel>
                  <Other>Weekly</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>
                <QuestionLabel>Other.who</QuestionLabel>
                <Answer>Mr Test Casetwo</Answer>
              </Name>
            </OtherMoneyDetails>
            <EEA>
              <EEAClaimPensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAClaimPensionsBenefits>
              <EEAReceivePensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAReceivePensionsBenefits>
              <EEAWorkingInsurance>
                <QuestionLabel>eea.insurance</QuestionLabel>
                <Answer>No</Answer>
              </EEAWorkingInsurance>
            </EEA>

          </OtherBenefits>
          <Payment>
            <PaymentFrequency>
              <QuestionLabel>payment.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </PaymentFrequency>
            <InitialAccountQuestion>
              <QuestionLabel>payment.way</QuestionLabel>
              <Answer>UK bank or building society</Answer>
            </InitialAccountQuestion>
            <Account>
              <HolderName>Mr Test Casetwo</HolderName>
              <BuildingSocietyDetails>
                <AccountNumber>12345678</AccountNumber>
                <!--    <RollNumber>RollNumber0</RollNumber> -->
                <SortCode>090126</SortCode>
                <Name>Santander</Name>
              </BuildingSocietyDetails>
            </Account>
          </Payment>
          <OtherInformation>
            <WelshCommunication>
              <QuestionLabel>welsh.communication</QuestionLabel>
              <Answer>No</Answer>
            </WelshCommunication>
            <AdditionalInformation>
              <QuestionLabel>anything.else</QuestionLabel>
              <Answer>1</Answer>
            </AdditionalInformation>
          </OtherInformation>
          <Declaration>I am the customer and have completed the form myself.</Declaration>
          <EvidenceList>
            <RecipientAddress>
              <Line>CA Freepost</Line>
              <Line>Palatine House</Line>
              <Line>Preston</Line>
              <PostCode>PR1 1HN</PostCode>
            </RecipientAddress>
            <Evidence>
              <Title>Document you need to send us</Title>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
            </Evidence>
            <Evidence>
              <Title>Pay Details</Title>
              <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
            </Evidence>
            <Evidence>
              <Title>Statement Signed</Title>
              <Content>You need to send us the completed and signed statement.</Content>
            </Evidence>
          </EvidenceList>
          <Consents>
            <Consent>
              <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
            <Consent>
              <QuestionLabel>Another consent question</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
          </Consents>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
    </DWPBody>
  }

  def functionalTestCase3: Elem = {
  <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
                                            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                                            xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance CarersAllowance_Schema_0.9.xsd">
    <Version>0.1</Version>
    <DWPCATransaction>
      <TransactionId>NFM33DB</TransactionId>
      <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
      <DWPCAClaim>
        <DateOfClaim>
          <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
          <Answer>01-01-2010</Answer>
        </DateOfClaim>
        <Claimant>
          <Surname>CaseThree</Surname>
          <OtherNames>Test Middle</OtherNames>
          <OtherSurnames>Smithson</OtherSurnames>
          <Title>Mr</Title>
          <DateOfBirth>01-01-1931</DateOfBirth>
          <NationalInsuranceNumber>JB486278C</NationalInsuranceNumber>
          <Address>
            <Line>3 Preston Road</Line>
            <Line>Preston</Line>
            <Line>Lancashire</Line>
            <PostCode>PR1 2TH</PostCode>
          </Address>
          <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
          <MobileNumber>0771 5419808</MobileNumber>
          <MaritalStatus>Single</MaritalStatus>
          <TextPhoneContact>
            <QuestionLabel>text.phone</QuestionLabel>
            <Answer>No</Answer>
          </TextPhoneContact>
        </Claimant>
        <Caree>
          <Surname>CaseThree</Surname>
          <OtherNames>Cloe Scott</OtherNames>
          <OtherSurnames>Watson</OtherSurnames>
          <Title>Dame</Title>
          <DateOfBirth>03-7-1953</DateOfBirth>
          <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
          <Address>
            <Line>3a Preston Road</Line>
            <Line>Preston</Line>
            <Line>Lancashire</Line>
            <PostCode>PR1 2TH</PostCode>
          </Address>
          <DayTimePhoneNumber>01234 567890</DayTimePhoneNumber>
          <RelationToClaimant>
            <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
            <Answer>Wife</Answer>
          </RelationToClaimant>
          <Cared35Hours>
            <QuestionLabel>Do you spend 35 hours or more each week caring for this person?</QuestionLabel>
            <Answer>Yes</Answer>
          </Cared35Hours>
          <BreaksSinceClaim>
            <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </BreaksSinceClaim>
          <CareBreak>
            <StartDateTime>10-07-2010 10:00</StartDateTime>
            <EndDateTime>17-07-2010 17:45</EndDateTime>
            <ReasonClaimant>
              <QuestionLabel>Where were you during the break?</QuestionLabel>
              <Other>At Home</Other>
              <Answer>Other</Answer>
            </ReasonClaimant>
            <ReasonCaree>
              <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
              <Answer>At Home</Answer>
            </ReasonCaree>
            <MedicalCare>
              <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
              <Answer>Yes</Answer>
            </MedicalCare>
          </CareBreak>
          <CareBreak>
            <StartDateTime>20-10-2010 10:00</StartDateTime>
            <EndDateTime>27-01-2010 17:00</EndDateTime>
            <ReasonClaimant>
              <QuestionLabel>Where were you during the break?</QuestionLabel>
              <Answer>Holiday</Answer>
            </ReasonClaimant>
            <ReasonCaree>
              <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
              <Answer>At Home</Answer>
            </ReasonCaree>
            <MedicalCare>
              <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
              <Answer>Yes</Answer>
            </MedicalCare>
          </CareBreak>
          <CareBreak>
            <StartDateTime>20-02-2010 12:00</StartDateTime>
            <EndDateTime>27-02-2010 13:00</EndDateTime>
            <ReasonClaimant>
              <QuestionLabel>Where were you during the break?</QuestionLabel>
              <Answer>Holiday</Answer>
            </ReasonClaimant>
            <ReasonCaree>
              <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
              <Answer>Respite Care</Answer>
            </ReasonCaree>
            <MedicalCare>
              <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
              <Answer>Yes</Answer>
            </MedicalCare>
          </CareBreak>
          <CareBreak>
            <StartDateTime>10-10-2010 10:30</StartDateTime>
          </CareBreak>
          <Cared35HoursBefore>
            <QuestionLabel>care.35.before</QuestionLabel>
            <Answer>No</Answer>
          </Cared35HoursBefore>
          <DateStartCaring>
            <QuestionLabel>care.started</QuestionLabel>
            <Answer>2010-05-01</Answer>
          </DateStartCaring>
          <LiveSameAddress>
            <QuestionLabel>caree.sameadrees</QuestionLabel>
            <Answer>Yes</Answer>
          </LiveSameAddress>
          <ArmedForcesIndependencePayment>
            <QuestionLabel>Does this person get Armed Forces Independence Payment?</QuestionLabel>
            <Answer>No</Answer>
          </ArmedForcesIndependencePayment>
        </Caree>
        <Residency>
          <NormallyLiveInGB>
            <QuestionLabel>live.normally.GB</QuestionLabel>
            <Answer>Yes</Answer>
          </NormallyLiveInGB>
          <CountryNormallyLive>
            <QuestionLabel>live.normally.country</QuestionLabel>
            <Answer>Not asked</Answer>
          </CountryNormallyLive>
          <Nationality>British</Nationality>
          <TimeOutsideGBLast3Years>
            <QuestionLabel>Time.out.GB</QuestionLabel>
            <Answer>Yes</Answer>
          </TimeOutsideGBLast3Years>
          <PeriodAbroad>
            <Period>
              <DateFrom>
                <QuestionLabel>abroad.date.from</QuestionLabel>
                <Answer>2010-08-09</Answer>
              </DateFrom>
              <DateTo>
                <QuestionLabel>abroad.date.to</QuestionLabel>
                <Answer>2010-08-12</Answer>
              </DateTo>
            </Period>
            <Reason>
              <QuestionLabel>abroad.reason</QuestionLabel>
              <Other>Holiday</Other>
              <Answer>Other</Answer>
            </Reason>
            <Country>
              <QuestionLabel>country.went</QuestionLabel>
              <Answer>Spain</Answer>
            </Country>
            <CareePresent>
              <QuestionLabel>caree.present</QuestionLabel>
              <Answer>No</Answer>
            </CareePresent>
          </PeriodAbroad>
          <PeriodAbroad>
            <Period>
              <DateFrom>
                <QuestionLabel>abroad.date.from</QuestionLabel>
                <Answer>2011-06-09</Answer>
              </DateFrom>
              <DateTo>
                <QuestionLabel>abroad.date.to</QuestionLabel>
                <Answer>2011-06-12</Answer>
              </DateTo>
            </Period>
            <Reason>
              <QuestionLabel>abroad.reason</QuestionLabel>
              <Answer>Holiday</Answer>
            </Reason>
            <Country>
              <QuestionLabel>country.went</QuestionLabel>
              <Answer>France</Answer>
            </Country>
            <CareePresent>
              <QuestionLabel>caree.present</QuestionLabel>
              <Answer>Yes</Answer>
            </CareePresent>
          </PeriodAbroad>

          <PeriodAbroad>
            <Period>
              <DateFrom>
                <QuestionLabel>abroad.date.from</QuestionLabel>
                <Answer>2011-06-09</Answer>
              </DateFrom>
              <DateTo>
                <QuestionLabel>abroad.date.to</QuestionLabel>
                <Answer>2011-06-12</Answer>
              </DateTo>
            </Period>
            <Reason>
              <QuestionLabel>abroad.reason</QuestionLabel>
              <Answer>Holiday</Answer>
            </Reason>
            <Country>
              <QuestionLabel>country.went</QuestionLabel>
              <Answer>Scotland</Answer>
            </Country>
            <CareePresent>
              <QuestionLabel>caree.present</QuestionLabel>
              <Answer>Yes</Answer>
            </CareePresent>
          </PeriodAbroad>

          <PeriodAbroad>
            <Period>
              <DateFrom>
                <QuestionLabel>abroad.date.from</QuestionLabel>
                <Answer>2011-06-09</Answer>
              </DateFrom>
              <DateTo>
                <QuestionLabel>abroad.date.to</QuestionLabel>
                <Answer>2011-06-12</Answer>
              </DateTo>
            </Period>
            <Reason>
              <QuestionLabel>abroad.reason</QuestionLabel>
              <Answer>Holiday</Answer>
            </Reason>
            <Country>
              <QuestionLabel>country.went</QuestionLabel>
              <Answer>Northumberland</Answer>
            </Country>
            <CareePresent>
              <QuestionLabel>caree.present</QuestionLabel>
              <Answer>Yes</Answer>
            </CareePresent>
          </PeriodAbroad>

          <PeriodAbroad>
            <Period>
              <DateFrom>
                <QuestionLabel>abroad.date.from</QuestionLabel>
                <Answer>2011-06-09</Answer>
              </DateFrom>
              <DateTo>
                <QuestionLabel>abroad.date.to</QuestionLabel>
                <Answer>2011-06-12</Answer>
              </DateTo>
            </Period>
            <Reason>
              <QuestionLabel>abroad.reason</QuestionLabel>
              <Answer>Holiday</Answer>
            </Reason>
            <Country>
              <QuestionLabel>country.went</QuestionLabel>
              <Answer>London</Answer>
            </Country>
            <CareePresent>
              <QuestionLabel>caree.present</QuestionLabel>
              <Answer>Yes</Answer>
            </CareePresent>
          </PeriodAbroad>

        </Residency>
        <CourseOfEducation>
          <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
          <Answer>Yes</Answer>
        </CourseOfEducation>
        <FullTimeEducation>
          <CourseDetails>
            <Type>BA honours in Business</Type>
            <Title>Bussines Studies</Title>
            <DateStarted>
              <QuestionLabel>education.started</QuestionLabel>
              <Answer>2013-01-01</Answer>
            </DateStarted>
            <!--               <DateStopped>
                              <QuestionLabel>education.ended</QuestionLabel>
                              <Answer>2013-05-04</Answer>
                          </DateStopped>
                          -->
            <ExpectedEndDate>
              <QuestionLabel>education.end.expected</QuestionLabel>
              <Answer>2014-05-01</Answer>
            </ExpectedEndDate>
          </CourseDetails>
          <LocationDetails>
            <Name>Oxford College</Name>
            <Address>
              <Line>1 Oxford Road</Line>
              <Line>Oxford</Line>
              <Line>Oxfordshire</Line>
              <PostCode>OX12 3RT</PostCode>
            </Address>
            <PhoneNumber>01776 829920</PhoneNumber>
            <FaxNumber>01776 829920</FaxNumber>
            <StudentReferenceNumber>91982</StudentReferenceNumber>
            <Tutor>My Tutor</Tutor>
          </LocationDetails>
        </FullTimeEducation>
        <SelfEmployed>
          <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
          <Answer>Yes</Answer>
        </SelfEmployed>
        <SelfEmployment>
          <SelfEmployedNow>
            <QuestionLabel>selfepmloyed.now</QuestionLabel>
            <Answer>No</Answer>
          </SelfEmployedNow>

          <CareExpensesChildren>
            <QuestionLabel>self.child.expenses</QuestionLabel>
            <Answer>Yes</Answer>
          </CareExpensesChildren>
          <ChildCareExpenses>
            <CarerName>
              <QuestionLabel>self.child.carer</QuestionLabel>
              <Answer>Mr John Smith</Answer>
            </CarerName>
            <Expense>
              <Payment>
                <QuestionLabel>self.child.care.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>120.00</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>self.child.care.frequency</QuestionLabel>
                <Answer>Weekly</Answer>
              </Frequency>
            </Expense>
            <RelationshipCarerToClaimant>
              <QuestionLabel>self.child.rel.claimant</QuestionLabel>
              <Answer>Uncle</Answer>
            </RelationshipCarerToClaimant>
            <RelationshipCarerToPartner>
              <QuestionLabel>self.child.rel.partner</QuestionLabel>
              <Other>None</Other>
              <Answer>Other</Answer>
            </RelationshipCarerToPartner>
            <RelationToChild>
              <QuestionLabel>self.child.rel.child</QuestionLabel>
              <Answer>Uncle</Answer>
            </RelationToChild>
          </ChildCareExpenses>
          <CareExpensesCaree>
            <QuestionLabel>self.care.expenses</QuestionLabel>
            <Answer>Yes</Answer>
          </CareExpensesCaree>
          <CareExpenses>
            <CarerName>
              <QuestionLabel>self.care.carer</QuestionLabel>
              <Answer>Mrs Terry Smith</Answer>
            </CarerName>
            <Expense>
              <Payment>
                <QuestionLabel>self.care.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>400.00</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>self.care.frequency</QuestionLabel>
                <Other>Other expenses frequency</Other>
                <Answer>Other</Answer>
              </Frequency>
            </Expense>
            <RelationshipCarerToClaimant>
              <QuestionLabel>self.care.rel.claimant</QuestionLabel>
              <Other>None</Other>
              <Answer>Other</Answer>
            </RelationshipCarerToClaimant>
            <RelationshipCarerToPartner>
              <QuestionLabel>self.care.rel.partner</QuestionLabel>
              <Answer>Aunt</Answer>
            </RelationshipCarerToPartner>
            <RelationshipCarerToCaree>
              <QuestionLabel>self.care.rel.caree</QuestionLabel>
              <Answer>Aunt</Answer>
            </RelationshipCarerToCaree>
          </CareExpenses>
          <PaidForPension>
            <QuestionLabel>self.pension</QuestionLabel>
            <Answer>Yes</Answer>
          </PaidForPension>
          <PensionScheme>
            <Payment>
              <QuestionLabel>self.pension.amount</QuestionLabel>
              <Answer>
                <Currency>GBP</Currency>
                <Amount>15.23</Amount>
              </Answer>
            </Payment>
            <Frequency>
              <QuestionLabel>self.pension.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </Frequency>
          </PensionScheme>
        </SelfEmployment>
        <Employed>
          <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
          <Answer>Yes</Answer>
        </Employed>
        <Employment>
          <CurrentlyEmployed>
            <QuestionLabel>employed.currently</QuestionLabel>
            <Answer>No</Answer>
          </CurrentlyEmployed>
          <JobDetails>
            <Employer>
              <DateJobStarted>
                <QuestionLabel>job.started</QuestionLabel>
                <Answer>2013-01-01</Answer>
              </DateJobStarted>
              <!--        <DateJobEnded>
                                    <QuestionLabel>job.ended</QuestionLabel>
                                    <Answer>2013-07-01</Answer>
                                </DateJobEnded> -->
              <JobType>
                <QuestionLabel>job.title</QuestionLabel>
                <Answer>Hacker</Answer>
              </JobType>
              <ClockPayrollNumber>12345678</ClockPayrollNumber>
              <Name>Tesco's</Name>
              <Address>
                <Line>23 Yeadon Way</Line>
                <Line>Blackpool</Line>
                <Line>Lancashire</Line>
                <PostCode>FY4 5TH</PostCode>
              </Address>
              <EmployersPhoneNumber>01253 667889</EmployersPhoneNumber>
              <HaveFinishedJob>
                <QuestionLabel>job.finished</QuestionLabel>
                <Answer>No</Answer>
              </HaveFinishedJob>
              <!--               <P45LeavingDate>
                                    <QuestionLabel>job.p45</QuestionLabel>
                                    <Answer>2013-07-01</Answer>
                                </P45LeavingDate> -->
            </Employer>
            <Pay>
              <WeeklyHoursWorked>
                <QuestionLabel>job.hours</QuestionLabel>
                <Answer>25</Answer>
              </WeeklyHoursWorked>
              <DateLastPaid>
                <QuestionLabel>job.lastpaid</QuestionLabel>
                <Answer>2013-07-02</Answer>
              </DateLastPaid>
              <GrossPayment>
                <QuestionLabel>job.pay</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>600.00</Amount>
                </Answer>
              </GrossPayment>
              <IncludedInWage>
                <QuestionLabel>job.pay.include</QuestionLabel>
                <Answer>All amounts due</Answer>
              </IncludedInWage>
              <PayFrequency>
                <QuestionLabel>job.pay.frequency</QuestionLabel>
                <Answer>Four-Weekly</Answer>
              </PayFrequency>
              <UsualPayDay>
                <QuestionLabel>job.day</QuestionLabel>
                <Answer>Wednesday usually</Answer>
              </UsualPayDay>
              <ConstantEarnings>
                <QuestionLabel>job.same.amount</QuestionLabel>
                <Answer>Yes</Answer>
              </ConstantEarnings>
            </Pay>
            <OweMoney>
              <QuestionLabel>job.owe</QuestionLabel>
              <Answer>No</Answer>
            </OweMoney>
            <CareExpensesChildren>
              <QuestionLabel>chld.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesChildren>
            <ChildCareExpenses>
              <CarerName>
                <QuestionLabel>child.carer</QuestionLabel>
                <Answer>Mr Grandfather Senior</Answer>
              </CarerName>
              <Expense>
                <Payment>
                  <QuestionLabel>child.care.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120.12</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>child.care.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Expense>
              <RelationshipCarerToClaimant>
                <QuestionLabel>child.care.rel.claimant</QuestionLabel>
                <Answer>Father</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToPartner>
                <QuestionLabel>cild.care.rel.partner</QuestionLabel>
                <Answer>Stepfather</Answer>
              </RelationshipCarerToPartner>
              <RelationToChild>
                <QuestionLabel>child.care.rel.child</QuestionLabel>
                <Answer>Grandfather</Answer>
              </RelationToChild>
            </ChildCareExpenses>
            <CareExpensesCaree>
              <QuestionLabel>care.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesCaree>
            <CareExpenses>
              <CarerName>
                <QuestionLabel>care.carer</QuestionLabel>
                <Answer>Carers UK Ltd</Answer>
              </CarerName>
              <Expense>
                <Payment>
                  <QuestionLabel>care.carer.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>150.55</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>care.carer.frequency</QuestionLabel>
                  <Other>Annually</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Expense>
              <RelationshipCarerToClaimant>
                <QuestionLabel>care.carer.rel.claimant</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToPartner>
                <QuestionLabel>care.carer.rel.partner</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToPartner>
              <RelationshipCarerToCaree>
                <QuestionLabel>care.carer.rel.caree</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToCaree>
            </CareExpenses>
            <PaidForOccupationalPension>
              <QuestionLabel>pension.occupational</QuestionLabel>
              <Answer>Yes</Answer>
            </PaidForOccupationalPension>
            <OccupationalPension>
              <Payment>
                <QuestionLabel>pension.occ.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>350.10</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>pension.occ.frequency</QuestionLabel>
                <Other>Other frequency fo occupational scheme</Other>
                <Answer>Other</Answer>
              </Frequency>
            </OccupationalPension>
            <PaidForPersonalPension>
              <QuestionLabel>pension.personal</QuestionLabel>
              <Answer>Yes</Answer>
            </PaidForPersonalPension>
            <PersonalPension>
              <Payment>
                <QuestionLabel>pension.per.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>200.1</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>pension.per.frequency</QuestionLabel>
                <Answer>Monthly</Answer>
              </Frequency>
            </PersonalPension>
            <PaidForJobExpenses>
              <QuestionLabel>job.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </PaidForJobExpenses>
            <JobExpenses>
              <Expense>
                <QuestionLabel>job.expense</QuestionLabel>
                <Answer>Petrol money for driving</Answer>
              </Expense>
            </JobExpenses>
            <OtherEmployment>
              <QuestionLabel>Other.eployment</QuestionLabel>
              <Answer>No</Answer>
            </OtherEmployment>
          </JobDetails>
        </Employment>
        <HavePartner>
          <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
          <Answer>Yes</Answer>
        </HavePartner>
        <Partner>
          <Surname>CaseThree</Surname>
          <OtherNames>Test Middle</OtherNames>
          <OtherSurnames>Dixon</OtherSurnames>
          <Title>Mrs</Title>
          <DateOfBirth>1937-09-28</DateOfBirth>
          <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
          <!-- <Address>
                        <Line>Line4</Line>
                        <PostCode>GIR 0AA</PostCode>
                    </Address>

                    <MobileNumber>       </MobileNumber> -->
          <DayTimePhoneNumber>0987654321</DayTimePhoneNumber>
          <NationalityPartner>British</NationalityPartner>
          <RelationshipStatus>
            <SeparatedFromPartner>
              <QuestionLabel>partner.separated</QuestionLabel>
              <Answer>No</Answer>
            </SeparatedFromPartner>
          </RelationshipStatus>
          <IsCaree>
            <QuestionLabel>Is your partner/spouse the person you are claiming Carer's Allowance for?</QuestionLabel>
            <Answer>No</Answer>
          </IsCaree>
        </Partner>
        <OtherBenefits>
          <ClaimantBenefits>
            <StatePension>
              <QuestionLabel>Do you get State Pension?</QuestionLabel>
              <Answer>No</Answer>
            </StatePension>
          </ClaimantBenefits>
          <OtherMoneySSP>
            <QuestionLabel>ssp.money</QuestionLabel>
            <Answer>No</Answer>
          </OtherMoneySSP>
          <OtherMoneySSPDetails>
            <Payment>
              <Payment>
                <QuestionLabel>ssp.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>12</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>ssp.frequency</QuestionLabel>
                <Other>Every day and twice on Sundays</Other>
                <Answer>Other</Answer>
              </Frequency>
            </Payment>
            <Name>Burger King</Name>
            <Address>
              <Line>102 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR45 6YH</PostCode>
            </Address>
          </OtherMoneySSPDetails>
          <OtherMoneySP>
            <QuestionLabel>sp.money</QuestionLabel>
            <Answer>Yes</Answer>
          </OtherMoneySP>
          <OtherMoneySPDetails>
            <Payment>
              <Payment>
                <QuestionLabel>sp.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>120</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>sp.frequency</QuestionLabel>
                <Answer>Weekly</Answer>
              </Frequency>
            </Payment>
            <Name>KFC</Name>
            <Address>
              <Line>104 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR45 6YH</PostCode>
            </Address>
          </OtherMoneySPDetails>
          <OtherMoney>
            <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
            <Answer>Yes</Answer>
          </OtherMoney>
          <OtherMoneyDetails>
            <Payment>
              <Payment>
                <QuestionLabel>Other.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>123.57</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>Other.frequency</QuestionLabel>
                <Other>Quarterly</Other>
                <Answer>Other</Answer>
              </Frequency>
            </Payment>
            <Name>
              <QuestionLabel>Other.who</QuestionLabel>
              <Answer>The Man</Answer>
            </Name>
          </OtherMoneyDetails>
          <EEA>
            <EEAClaimPensionsBenefits>
              <QuestionLabel>eea.pension</QuestionLabel>
              <Answer>No</Answer>
            </EEAClaimPensionsBenefits>
            <EEAReceivePensionsBenefits>
              <QuestionLabel>eea.pension</QuestionLabel>
              <Answer>No</Answer>
            </EEAReceivePensionsBenefits>
            <EEAWorkingInsurance>
              <QuestionLabel>eea.insurance</QuestionLabel>
              <Answer>No</Answer>
            </EEAWorkingInsurance>
          </EEA>

        </OtherBenefits>
        <Payment>
          <PaymentFrequency>
            <QuestionLabel>payment.frequency</QuestionLabel>
            <Answer>Weekly</Answer>
          </PaymentFrequency>
          <InitialAccountQuestion>
            <QuestionLabel>payment.way</QuestionLabel>
            <Answer>UK bank or building society</Answer>
          </InitialAccountQuestion>
          <Account>
            <HolderName>Mr Test Casetwo</HolderName>
            <BuildingSocietyDetails>
              <AccountNumber>12345678</AccountNumber>
              <!--    <RollNumber>RollNumber0</RollNumber> -->
              <SortCode>090126</SortCode>
              <Name>Santander</Name>
            </BuildingSocietyDetails>
          </Account>
        </Payment>
        <OtherInformation>
          <WelshCommunication>
            <QuestionLabel>welsh.communication</QuestionLabel>
            <Answer>No</Answer>
          </WelshCommunication>
          <AdditionalInformation>
            <QuestionLabel>anything.else</QuestionLabel>
            <Answer>It takes too long to claim. But I can write a very long answer here. 2000 characters.</Answer>
          </AdditionalInformation>
        </OtherInformation>
        <Declaration>I am the customer and have completed the form myself.</Declaration>
        <EvidenceList>
          <RecipientAddress>
            <Line>CA Freepost</Line>
            <Line>Palatine House</Line>
            <Line>Preston</Line>
            <PostCode>PR1 1HN</PostCode>
          </RecipientAddress>
          <Evidence>
            <Title>Document you need to send us</Title>
            <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
            <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
            <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
          </Evidence>
          <Evidence>
            <Title>Pay Details</Title>
            <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
          </Evidence>
          <Evidence>
            <Title>Statement Signed</Title>
            <Content>You need to send us the completed and signed statement.</Content>
          </Evidence>
        </EvidenceList>
        <Consents>
          <Consent>
            <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
            <Answer>Yes</Answer>
          </Consent>
          <Consent>
            <QuestionLabel>Another consent question</QuestionLabel>
            <Answer>Yes</Answer>
          </Consent>
        </Consents>
      </DWPCAClaim>
    </DWPCATransaction>
    <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
      <ds:SignedInfo>
        <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
        <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
        <ds:Reference URI="DWPCATransaction">
          <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
          <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
        </ds:Reference>
      </ds:SignedInfo>
      <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
    </ds:Signature>
  </DWPBody>
  }

  def functionalTestCase4: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance file:/Users/jmi/Temp/CarersAllowance_Schema.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim>
          <DateOfClaim>
            <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
            <Answer>05-01-2013</Answer>
          </DateOfClaim>
          <Claimant>
            <Surname>CaseFour</Surname>
            <OtherNames>Test Middle</OtherNames>
            <OtherSurnames>Thornhill</OtherSurnames>
            <Title>Mr</Title>
            <DateOfBirth>01-01-1951</DateOfBirth>
            <NationalInsuranceNumber>JB486248C</NationalInsuranceNumber>
            <Address>
              <Line>4 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <MaritalStatus>Married or civil partner</MaritalStatus>
          </Claimant>
          <Caree>
            <Surname>watson</Surname>
            <OtherNames>Cloe scott</OtherNames>
            <Title>Dame</Title>
            <DateOfBirth>03-07-1951</DateOfBirth>
            <NationalInsuranceNumber>JB486248C</NationalInsuranceNumber>
            <Address>
              <Line>12 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 1HB</PostCode>
            </Address>
            <DayTimePhoneNumber>01234 567890</DayTimePhoneNumber>
            <RelationToClaimant>
              <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
              <Answer>Mother</Answer>
            </RelationToClaimant>
            <BreaksSinceClaim>
              <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
              <Answer>Yes</Answer>
            </BreaksSinceClaim>
            <CareBreak>
              <StartDateTime>10-07-2010 10:00</StartDateTime>
              <EndDateTime>17-08-2010 17:45</EndDateTime>
              <ReasonClaimant>
                <QuestionLabel>Where were you during the break?</QuestionLabel>
                <Answer>At Home</Answer>
              </ReasonClaimant>
              <MedicalCare>
                <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
                <Answer>Yes</Answer>
              </MedicalCare>
            </CareBreak>
            <DateStartCaring>
              <QuestionLabel>care.started</QuestionLabel>
              <Answer>05-01-2010</Answer>
            </DateStartCaring>
          </Caree>

          <Residency>
            <NormallyLiveInGB>
              <QuestionLabel>live.normally.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </NormallyLiveInGB>
            <Nationality>British</Nationality>
            <TimeOutsideGBLast3Years>
              <QuestionLabel>Time.out.GB</QuestionLabel>
              <Answer>No</Answer>
            </TimeOutsideGBLast3Years>
          </Residency>
          <CourseOfEducation>
            <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
            <Answer>No</Answer>
          </CourseOfEducation>
          <SelfEmployed>
            <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </SelfEmployed>
          <SelfEmployment>
            <SelfEmployedNow>
              <QuestionLabel>selfepmloyed.now</QuestionLabel>
              <Answer>Yes</Answer>
            </SelfEmployedNow>
            <CurrentJobDetails>
              <DateStarted>
                <QuestionLabel>QuestionLabel34</QuestionLabel>
                <Answer>01-02-2010</Answer>
              </DateStarted>
              <NatureBusiness>
                <QuestionLabel>selfemployed.business</QuestionLabel>
                <Answer>Fruit and veg, delivery service</Answer>
              </NatureBusiness>
              <TradingYear>
                <DateFrom>
                  <QuestionLabel>QuestionLabel36</QuestionLabel>
                  <Answer>01-02-2012</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>QuestionLabel37</QuestionLabel>
                  <Answer>31-01-2013</Answer>
                </DateTo>
              </TradingYear>
              <SameIncomeOutgoingLevels>
                <QuestionLabel>QuestionLabel38</QuestionLabel>
                <Answer>Yes</Answer>
              </SameIncomeOutgoingLevels>
              <WhyWhenChange>
                <QuestionLabel>QuestionLabel39</QuestionLabel>
                <Answer>Answer25</Answer>
              </WhyWhenChange>
            </CurrentJobDetails>
            <CareExpensesChildren>
              <QuestionLabel>self.child.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesChildren>
            <ChildCareExpenses>
              <CarerName>
                <QuestionLabel>self.child.carer</QuestionLabel>
                <Answer>Mr John Johnson</Answer>
              </CarerName>

              <RelationshipCarerToClaimant>
                <QuestionLabel>self.child.rel.claimant</QuestionLabel>
                <Answer>Brother</Answer>
              </RelationshipCarerToClaimant>
            </ChildCareExpenses>
            <CareExpensesCaree>
              <QuestionLabel>self.care.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesCaree>
            <CareExpenses>
              <CarerName>
                <QuestionLabel>self.care.carer</QuestionLabel>
                <Answer>Mrs Terry Thornhill</Answer>
              </CarerName>
              <RelationshipCarerToClaimant>
                <QuestionLabel>self.care.rel.claimant</QuestionLabel>
                <Answer>Aunt</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToCaree>
                <QuestionLabel>self.care.rel.caree</QuestionLabel>
                <Answer>Adopted Son</Answer>
              </RelationshipCarerToCaree>
            </CareExpenses>
            <PaidForPension>
              <QuestionLabel>self.pension</QuestionLabel>
              <Answer>Yes</Answer>
            </PaidForPension>
            <PensionScheme>
              <Payment>
                <QuestionLabel>self.pension.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>15.23</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>self.pension.frequency</QuestionLabel>
                <Answer>Weekly</Answer>
              </Frequency>
            </PensionScheme>
          </SelfEmployment>
          <Employed>
            <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </Employed>
          <Employment>
            <CurrentlyEmployed>
              <QuestionLabel>employed.currently</QuestionLabel>
              <Answer>Yes</Answer>
            </CurrentlyEmployed>
            <JobDetails>
              <Employer>
                <DateJobStarted>
                  <QuestionLabel>job.started</QuestionLabel>
                  <Answer>01-01-2013</Answer>
                </DateJobStarted>
                <JobType>
                  <QuestionLabel>job.title</QuestionLabel>
                  <Answer>Hacker</Answer>
                </JobType>
                <ClockPayrollNumber>12345678</ClockPayrollNumber>
                <Name>Tesco's Bank</Name>
                <Address>
                  <Line>23 Yeadon Way</Line>
                  <Line>Blackpool</Line>
                  <Line>Lancashire</Line>
                  <PostCode>FY4 5TH</PostCode>
                </Address>
                <EmployersPhoneNumber>01253 667889</EmployersPhoneNumber>
              </Employer>
              <Pay>
                <WeeklyHoursWorked>
                  <QuestionLabel>job.hours</QuestionLabel>
                  <Answer>25</Answer>
                </WeeklyHoursWorked>
                <DateLastPaid>
                  <QuestionLabel>job.lastpaid</QuestionLabel>
                  <Answer>08-07-2013</Answer>
                </DateLastPaid>
                <GrossPayment>
                  <QuestionLabel>job.pay</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>600.00</Amount>
                  </Answer>
                </GrossPayment>
                <IncludedInWage>
                  <QuestionLabel>job.pay.include</QuestionLabel>
                  <Answer>All amounts due</Answer>
                </IncludedInWage>
                <PayFrequency>
                  <QuestionLabel>job.pay.frequency</QuestionLabel>
                  <Answer>Other</Answer>
                </PayFrequency>
                <UsualPayDay>
                  <QuestionLabel>job.day</QuestionLabel>
                  <Answer>Two weeks ago</Answer>
                </UsualPayDay>
              </Pay>
              <OweMoney>
                <QuestionLabel>job.owe</QuestionLabel>
                <Answer>No</Answer>
              </OweMoney>
              <CareExpensesChildren>
                <QuestionLabel>chld.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesChildren>
              <ChildCareExpenses>
                <CarerName>
                  <QuestionLabel>child.carer</QuestionLabel>
                  <Answer>Mr Grandfather Senior</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>child.care.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>120.12</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>child.care.frequency</QuestionLabel>
                    <Answer>Weekly</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>child.care.rel.claimant</QuestionLabel>
                  <Answer>Father</Answer>
                </RelationshipCarerToClaimant>
              </ChildCareExpenses>
              <CareExpensesCaree>
                <QuestionLabel>care.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesCaree>
              <CareExpenses>
                <CarerName>
                  <QuestionLabel>care.carer</QuestionLabel>
                  <Answer>Carers UK Ltd</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>care.carer.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>150.55</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>care.carer.frequency</QuestionLabel>
                    <Other>Annually</Other>
                    <Answer>Other</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>care.carer.rel.claimant</QuestionLabel>
                  <Answer>Father</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToCaree>
                  <QuestionLabel>care.carer.rel.caree</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToCaree>
              </CareExpenses>
              <PaidForOccupationalPension>
                <QuestionLabel>pension.occupational</QuestionLabel>
                <Answer>No</Answer>
              </PaidForOccupationalPension>
              <PaidForPersonalPension>
                <QuestionLabel>pension.personal</QuestionLabel>
                <Answer>No</Answer>
              </PaidForPersonalPension>
              <PaidForJobExpenses>
                <QuestionLabel>job.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForJobExpenses>
              <JobExpenses>
                <Expense>
                  <QuestionLabel>job.expense</QuestionLabel>
                  <Answer>Petrol money for driving</Answer>
                </Expense>
              </JobExpenses>
            </JobDetails>
          </Employment>
          <HavePartner>
            <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
            <Answer>No</Answer>
          </HavePartner>

          <OtherBenefits>
            <ClaimantBenefits>
              <StatePension>
                <QuestionLabel>Do you get State Pension?</QuestionLabel>
                <Answer>No</Answer>
              </StatePension>
            </ClaimantBenefits>
            <OtherMoneySSP>
              <QuestionLabel>ssp.money</QuestionLabel>
              <Answer>No</Answer>
            </OtherMoneySSP>
            <OtherMoneySSPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>ssp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>12</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>ssp.frequency</QuestionLabel>
                  <Other>Every day and twice on Sundays</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>Burger King</Name>
              <Address>
                <Line>102 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySSPDetails>
            <OtherMoneySP>
              <QuestionLabel>sp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySP>
            <OtherMoneySPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>sp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>sp.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Payment>
              <Name>KFC</Name>
              <Address>
                <Line>104 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySPDetails>
            <OtherMoney>
              <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoney>
            <OtherMoneyDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>sp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>sp.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Payment>
            </OtherMoneyDetails>
          </OtherBenefits>
          <Payment>
            <PaymentFrequency>
              <QuestionLabel>payment.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </PaymentFrequency>
            <InitialAccountQuestion>
              <QuestionLabel>payment.way</QuestionLabel>
              <Answer>UK bank or building society</Answer>
            </InitialAccountQuestion>
            <Account>
              <HolderName>Mr Test Casetwo</HolderName>
              <BuildingSocietyDetails>
                <AccountNumber>12345678</AccountNumber>
                <!--    <RollNumber>RollNumber0</RollNumber> -->
                <SortCode>090126</SortCode>
                <Name>Santander</Name>
              </BuildingSocietyDetails>
            </Account>
          </Payment>
          <OtherInformation>
            <WelshCommunication>
              <QuestionLabel>welsh.communication</QuestionLabel>
              <Answer>No</Answer>
            </WelshCommunication>
            <AdditionalInformation>
              <QuestionLabel>anything.else</QuestionLabel>
              <Answer>It takes too long to claim. But I can write a very long answer here. 2000 characters.</Answer>
            </AdditionalInformation>
          </OtherInformation>
          <Declaration>I am the customer and have completed the form myself.</Declaration>
          <EvidenceList>
            <RecipientAddress>
              <Line>CA Freepost</Line>
              <Line>Palatine House</Line>
              <Line>Preston</Line>
              <PostCode>PR1 1HN</PostCode>
            </RecipientAddress>
            <Evidence>
              <Title>Document you need to send us</Title>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
            </Evidence>
            <Evidence>
              <Title>Pay Details</Title>
              <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
            </Evidence>
            <Evidence>
              <Title>Statement Signed</Title>
              <Content>You need to send us the completed and signed statement.</Content>
            </Evidence>
          </EvidenceList>
          <Consents>
            <Consent>
              <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
            <Consent>
              <QuestionLabel>Another consent question</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
          </Consents>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
    </DWPBody>
  }

  def functionalTestCase5: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance CarersAllowance_Schema_0.9.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim>
          <DateOfClaim>
            <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
            <Answer>01-01-2010</Answer>
          </DateOfClaim>
          <Claimant>
            <Surname>CaseFive</Surname>
            <OtherNames>Test Middle</OtherNames>
            <OtherSurnames>Donaldson</OtherSurnames>
            <Title>Mr</Title>
            <DateOfBirth>01-01-1981</DateOfBirth>
            <NationalInsuranceNumber>XB486248C</NationalInsuranceNumber>
            <Address>
              <Line>5 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <MobileNumber>0771 5419808</MobileNumber>
            <MaritalStatus>Single</MaritalStatus>
            <TextPhoneContact>
              <QuestionLabel>text.phone</QuestionLabel>
              <Answer>No</Answer>
            </TextPhoneContact>
          </Claimant>
          <Caree>
            <Surname>Forfive</Surname>
            <OtherNames>Person Cared</OtherNames>
            <OtherSurnames>Watson</OtherSurnames>
            <Title>Mrs</Title>
            <DateOfBirth>12-09-1933</DateOfBirth>
            <NationalInsuranceNumber>JA789871C</NationalInsuranceNumber>
            <Address>
              <Line>5 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01234 567890</DayTimePhoneNumber>
            <RelationToClaimant>
              <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
              <Answer>Sister</Answer>
            </RelationToClaimant>
            <Cared35Hours>
              <QuestionLabel>Do you spend 35 hours or more each week caring for this person?</QuestionLabel>
              <Answer>Yes</Answer>
            </Cared35Hours>
            <BreaksSinceClaim>
              <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
              <Answer>Yes</Answer>
            </BreaksSinceClaim>
            <CareBreak>
              <StartDateTime>10-07-2010 10:00</StartDateTime>
              <EndDateTime>17-07-2010 17:45</EndDateTime>
              <ReasonClaimant>
                <QuestionLabel>Where were you during the break?</QuestionLabel>
                <Other>Friend's place</Other>
                <Answer>Other</Answer>
              </ReasonClaimant>
              <ReasonCaree>
                <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
                <Answer>At Home</Answer>
              </ReasonCaree>
              <MedicalCare>
                <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
                <Answer>Yes</Answer>
              </MedicalCare>
            </CareBreak>
            <CareBreak>
              <StartDateTime>10-09-2010 12:00</StartDateTime>
              <EndDateTime>17-09-2010 15:15</EndDateTime>
              <ReasonClaimant>
                <QuestionLabel>Where were you during the break?</QuestionLabel>
                <Answer>Hospital</Answer>
              </ReasonClaimant>
              <ReasonCaree>
                <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
                <Answer>Respite Care</Answer>
              </ReasonCaree>
              <MedicalCare>
                <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
                <Answer>Yes</Answer>
              </MedicalCare>
            </CareBreak>
            <CareBreak>
              <StartDateTime>10-09-2010 12:00</StartDateTime>
              <EndDateTime>17-09-2010 15:15</EndDateTime>
              <ReasonClaimant>
                <QuestionLabel>Where were you during the break?</QuestionLabel>
                <Answer>Holiday</Answer>
              </ReasonClaimant>
              <ReasonCaree>
                <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
                <Answer>Other</Answer>
              </ReasonCaree>
              <MedicalCare>
                <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
                <Answer>Yes</Answer>
              </MedicalCare>
            </CareBreak>
            <CareBreak>
              <StartDateTime>10-10-2010 10:30</StartDateTime>
            </CareBreak>
            <Cared35HoursBefore>
              <QuestionLabel>care.35.before</QuestionLabel>
              <Answer>No</Answer>
            </Cared35HoursBefore>
            <DateStartCaring>
              <QuestionLabel>care.started</QuestionLabel>
              <Answer>05-01-2010</Answer>
            </DateStartCaring>
            <LiveSameAddress>
              <QuestionLabel>caree.sameadrees</QuestionLabel>
              <Answer>Yes</Answer>
            </LiveSameAddress>
            <ArmedForcesIndependencePayment>
              <QuestionLabel>Does this person get Armed Forces Independence Payment?</QuestionLabel>
              <Answer>No</Answer>
            </ArmedForcesIndependencePayment>
          </Caree>
          <Residency>
            <NormallyLiveInGB>
              <QuestionLabel>live.normally.GB</QuestionLabel>
              <Answer>No</Answer>
            </NormallyLiveInGB>
            <CountryNormallyLive>
              <QuestionLabel>live.normally.country</QuestionLabel>
              <Answer>France</Answer>
            </CountryNormallyLive>
            <Nationality>British</Nationality>
            <TimeOutsideGBLast3Years>
              <QuestionLabel>Time.out.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </TimeOutsideGBLast3Years>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>08-09-2010</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>08-12-2010</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Other>Funeral</Other>
                <Answer>Holiday</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>Scotland</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>No</Answer>
              </CareePresent>
            </PeriodAbroad>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>06-09-2011</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>06-12-2011</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Answer>Holiday</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>Spain</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>Yes</Answer>
              </CareePresent>
            </PeriodAbroad>
          </Residency>
          <CourseOfEducation>
            <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </CourseOfEducation>
          <FullTimeEducation>
            <CourseDetails>
              <Type>BA honours in Business</Type>
              <Title>Bussines Studies</Title>
              <DateStarted>
                <QuestionLabel>education.started</QuestionLabel>
                <Answer>01-01-2013</Answer>
              </DateStarted>
              <!--               <DateStopped>
                                    <QuestionLabel>education.ended</QuestionLabel>
                                    <Answer>2013-05-04</Answer>
                                </DateStopped>
                                -->
              <ExpectedEndDate>
                <QuestionLabel>education.end.expected</QuestionLabel>
                <Answer>05-01-2014</Answer>
              </ExpectedEndDate>
            </CourseDetails>
            <LocationDetails>
              <Name>Oxford College</Name>
              <Address>
                <Line>1 Oxford Road</Line>
                <Line>Oxford</Line>
                <Line>Oxfordshire</Line>
                <PostCode>OX12 3RT</PostCode>
              </Address>
              <PhoneNumber>01776 829920</PhoneNumber>
              <FaxNumber>01776 829920</FaxNumber>
              <StudentReferenceNumber>91982</StudentReferenceNumber>
              <Tutor>My Tutor</Tutor>
            </LocationDetails>
          </FullTimeEducation>
          <SelfEmployed>
            <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </SelfEmployed>
          <SelfEmployment>
            <SelfEmployedNow>
              <QuestionLabel>selfepmloyed.now</QuestionLabel>
              <Answer>No</Answer>
            </SelfEmployedNow>
            <RecentJobDetails>
              <DateStarted>
                <QuestionLabel>selfemployed.started</QuestionLabel>
                <Answer>05-01-2010</Answer>
              </DateStarted>
              <NatureBusiness>
                <QuestionLabel>selfemployed.business</QuestionLabel>
                <Answer>Fruit and veg, delivery service</Answer>
              </NatureBusiness>
              <TradingYear>
                <DateFrom>
                  <QuestionLabel>trading.from</QuestionLabel>
                  <Answer>05-01-2013</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>trading.to</QuestionLabel>
                  <Answer>30-04-2014</Answer>
                </DateTo>
              </TradingYear>
              <SameIncomeOutgoingLevels>
                <QuestionLabel>selfemployed.level</QuestionLabel>
                <Answer>No</Answer>
              </SameIncomeOutgoingLevels>
              <WhyWhenChange>
                <QuestionLabel>slefemployed.level.change</QuestionLabel>
                <Answer>Depends on the seasons, and productivity of the fruit.</Answer>
              </WhyWhenChange>
              <DateEnded>
                <QuestionLabel>selfemployed.ended</QuestionLabel>
                <Answer>01-09-2013</Answer>
              </DateEnded>
              <TradingCeased>
                <QuestionLabel>selfemployed.ceased</QuestionLabel>
                <Answer>Yes</Answer>
              </TradingCeased>
            </RecentJobDetails>
            <!--                <CurrentJobDetails>
                            <DateStarted>
                                <QuestionLabel>QuestionLabel34</QuestionLabel>
                                <Answer>2006-05-04</Answer>
                            </DateStarted>
                            <NatureBusiness>
                                <QuestionLabel>QuestionLabel35</QuestionLabel>
                                <Answer>Answer23</Answer>
                            </NatureBusiness>
                            <TradingYear>
                                <DateFrom>
                                    <QuestionLabel>QuestionLabel36</QuestionLabel>
                                    <Answer>2006-05-04</Answer>
                                </DateFrom>
                                <DateTo>
                                    <QuestionLabel>QuestionLabel37</QuestionLabel>
                                    <Answer>2006-05-04</Answer>
                                </DateTo>
                            </TradingYear>
                            <SameIncomeOutgoingLevels>
                                <QuestionLabel>QuestionLabel38</QuestionLabel>
                                <Answer>Yes</Answer>
                            </SameIncomeOutgoingLevels>
                            <WhyWhenChange>
                                <QuestionLabel>QuestionLabel39</QuestionLabel>
                                <Answer>Answer25</Answer>
                            </WhyWhenChange>
                        </CurrentJobDetails>-->
            <CareExpensesChildren>
              <QuestionLabel>self.child.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesChildren>
            <ChildCareExpenses>
              <CarerName>
                <QuestionLabel>self.child.carer</QuestionLabel>
                <Answer>Mr John Smith</Answer>
              </CarerName>
              <Expense>
                <Payment>
                  <QuestionLabel>self.child.care.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120.00</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>self.child.care.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Expense>
              <RelationshipCarerToClaimant>
                <QuestionLabel>self.child.rel.claimant</QuestionLabel>
                <Answer>Uncle</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToPartner>
                <QuestionLabel>self.child.rel.partner</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToPartner>
              <RelationToChild>
                <QuestionLabel>self.child.rel.child</QuestionLabel>
                <Answer>Uncle</Answer>
              </RelationToChild>
            </ChildCareExpenses>
            <CareExpensesCaree>
              <QuestionLabel>self.care.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesCaree>
            <CareExpenses>
              <CarerName>
                <QuestionLabel>self.care.carer</QuestionLabel>
                <Answer>Mrs Terry Smith</Answer>
              </CarerName>
              <Expense>
                <Payment>
                  <QuestionLabel>self.care.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>400.00</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>self.care.frequency</QuestionLabel>
                  <Other>Other expenses frequency</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Expense>
              <RelationshipCarerToClaimant>
                <QuestionLabel>self.care.rel.claimant</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToPartner>
                <QuestionLabel>self.care.rel.partner</QuestionLabel>
                <Answer>Aunt</Answer>
              </RelationshipCarerToPartner>
              <RelationshipCarerToCaree>
                <QuestionLabel>self.care.rel.caree</QuestionLabel>
                <Answer>Aunt</Answer>
              </RelationshipCarerToCaree>
            </CareExpenses>
            <PaidForPension>
              <QuestionLabel>self.pension</QuestionLabel>
              <Answer>Yes</Answer>
            </PaidForPension>
            <PensionScheme>
              <Payment>
                <QuestionLabel>self.pension.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>15.23</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>self.pension.frequency</QuestionLabel>
                <Answer>Weekly</Answer>
              </Frequency>
            </PensionScheme>
          </SelfEmployment>
          <Employed>
            <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </Employed>
          <Employment>
            <CurrentlyEmployed>
              <QuestionLabel>employed.currently</QuestionLabel>
              <Answer>Yes</Answer>
            </CurrentlyEmployed>
            <JobDetails>
              <Employer>
                <DateJobStarted>
                  <QuestionLabel>job.started</QuestionLabel>
                  <Answer>01-01-2013</Answer>
                </DateJobStarted>
                <!--        <DateJobEnded>
                                            <QuestionLabel>job.ended</QuestionLabel>
                                            <Answer>2013-07-01</Answer>
                                        </DateJobEnded> -->
                <JobType>
                  <QuestionLabel>job.title</QuestionLabel>
                  <Answer>Hacker</Answer>
                </JobType>
                <ClockPayrollNumber>12345678</ClockPayrollNumber>
                <Name>Tesco's</Name>
                <Address>
                  <Line>23 Yeadon Way</Line>
                  <Line>Blackpool</Line>
                  <Line>Lancashire</Line>
                  <PostCode>FY4 5TH</PostCode>
                </Address>
                <EmployersPhoneNumber>01253 667889</EmployersPhoneNumber>
                <HaveFinishedJob>
                  <QuestionLabel>job.finished</QuestionLabel>
                  <Answer>No</Answer>
                </HaveFinishedJob>
                <!--               <P45LeavingDate>
                                            <QuestionLabel>job.p45</QuestionLabel>
                                            <Answer>2013-07-01</Answer>
                                        </P45LeavingDate> -->
              </Employer>
              <Pay>
                <WeeklyHoursWorked>
                  <QuestionLabel>job.hours</QuestionLabel>
                  <Answer>25</Answer>
                </WeeklyHoursWorked>
                <DateLastPaid>
                  <QuestionLabel>job.lastpaid</QuestionLabel>
                  <Answer>02-07-2013</Answer>
                </DateLastPaid>
                <GrossPayment>
                  <QuestionLabel>job.pay</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>600.00</Amount>
                  </Answer>
                </GrossPayment>
                <IncludedInWage>
                  <QuestionLabel>job.pay.include</QuestionLabel>
                  <Answer>All amounts due</Answer>
                </IncludedInWage>
                <PayFrequency>
                  <QuestionLabel>job.pay.frequency</QuestionLabel>
                  <Answer>Four-Weekly</Answer>
                </PayFrequency>
                <UsualPayDay>
                  <QuestionLabel>job.day</QuestionLabel>
                  <Answer>Wednesday usually</Answer>
                </UsualPayDay>
                <ConstantEarnings>
                  <QuestionLabel>job.same.amount</QuestionLabel>
                  <Answer>Yes</Answer>
                </ConstantEarnings>
              </Pay>
              <OweMoney>
                <QuestionLabel>job.owe</QuestionLabel>
                <Answer>No</Answer>
              </OweMoney>
              <CareExpensesChildren>
                <QuestionLabel>chld.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesChildren>
              <ChildCareExpenses>
                <CarerName>
                  <QuestionLabel>child.carer</QuestionLabel>
                  <Answer>Mr Grandfather Senior</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>child.care.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>120.12</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>child.care.frequency</QuestionLabel>
                    <Answer>Weekly</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>child.care.rel.claimant</QuestionLabel>
                  <Answer>Father</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToPartner>
                  <QuestionLabel>cild.care.rel.partner</QuestionLabel>
                  <Answer>Stepfather</Answer>
                </RelationshipCarerToPartner>
                <RelationToChild>
                  <QuestionLabel>child.care.rel.child</QuestionLabel>
                  <Answer>Grandfather</Answer>
                </RelationToChild>
              </ChildCareExpenses>
              <CareExpensesCaree>
                <QuestionLabel>care.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesCaree>
              <CareExpenses>
                <CarerName>
                  <QuestionLabel>care.carer</QuestionLabel>
                  <Answer>Carers UK Ltd</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>care.carer.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>150.55</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>care.carer.frequency</QuestionLabel>
                    <Other>Annually</Other>
                    <Answer>Other</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>care.carer.rel.claimant</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToPartner>
                  <QuestionLabel>care.carer.rel.partner</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToPartner>
                <RelationshipCarerToCaree>
                  <QuestionLabel>care.carer.rel.caree</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToCaree>
              </CareExpenses>
              <PaidForOccupationalPension>
                <QuestionLabel>pension.occupational</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForOccupationalPension>
              <OccupationalPension>
                <Payment>
                  <QuestionLabel>pension.occ.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>350.10</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.occ.frequency</QuestionLabel>
                  <Other>Other frequency fo occupational scheme</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </OccupationalPension>
              <PaidForPersonalPension>
                <QuestionLabel>pension.personal</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForPersonalPension>
              <PersonalPension>
                <Payment>
                  <QuestionLabel>pension.per.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>200.1</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.per.frequency</QuestionLabel>
                  <Answer>Monthly</Answer>
                </Frequency>
              </PersonalPension>
              <PaidForJobExpenses>
                <QuestionLabel>job.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForJobExpenses>
              <JobExpenses>
                <Expense>
                  <QuestionLabel>job.expense</QuestionLabel>
                  <Answer>Petrol money for driving</Answer>
                </Expense>
              </JobExpenses>
              <OtherEmployment>
                <QuestionLabel>Other.eployment</QuestionLabel>
                <Answer>No</Answer>
              </OtherEmployment>
            </JobDetails>
          </Employment>
          <HavePartner>
            <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </HavePartner>
          <Partner>
            <Surname>CaseThree</Surname>
            <OtherNames>Test Middle</OtherNames>
            <OtherSurnames>Dixon</OtherSurnames>
            <Title>Mrs</Title>
            <DateOfBirth>28-09-1937</DateOfBirth>
            <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
            <!-- <Address>
                            <Line>Line4</Line>
                            <PostCode>GIR 0AA</PostCode>
                        </Address>

                        <MobileNumber>       </MobileNumber> -->
            <DayTimePhoneNumber>0987654321</DayTimePhoneNumber>
            <NationalityPartner>British</NationalityPartner>
            <RelationshipStatus>
              <SeparatedFromPartner>
                <QuestionLabel>partner.separated</QuestionLabel>
                <Answer>No</Answer>
              </SeparatedFromPartner>
            </RelationshipStatus>
            <IsCaree>
              <QuestionLabel>Is your partner/spouse the person you are claiming Carer's Allowance for?</QuestionLabel>
              <Answer>No</Answer>
            </IsCaree>
          </Partner>
          <OtherBenefits>
            <ClaimantBenefits>
              <StatePension>
                <QuestionLabel>Do you get State Pension?</QuestionLabel>
                <Answer>Yes</Answer>
              </StatePension>
            </ClaimantBenefits>
            <OtherMoneySSP>
              <QuestionLabel>ssp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySSP>
            <OtherMoneySSPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>ssp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>12</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>ssp.frequency</QuestionLabel>
                  <Other>Every day and twice on Sundays</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>Burger King</Name>
              <Address>
                <Line>102 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySSPDetails>
            <OtherMoneySP>
              <QuestionLabel>sp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySP>
            <OtherMoneySPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>sp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>sp.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Payment>
              <Name>KFC</Name>
              <Address>
                <Line>104 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySPDetails>
            <OtherMoney>
              <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoney>
            <OtherMoneyDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>Other.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>123.57</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>Other.frequency</QuestionLabel>
                  <Other>Quarterly</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>
                <QuestionLabel>Other.who</QuestionLabel>
                <Answer>The Man</Answer>
              </Name>
            </OtherMoneyDetails>
            <EEA>
              <EEAClaimPensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAClaimPensionsBenefits>
              <EEAReceivePensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAReceivePensionsBenefits>
              <EEAWorkingInsurance>
                <QuestionLabel>eea.insurance</QuestionLabel>
                <Answer>No</Answer>
              </EEAWorkingInsurance>
            </EEA>

          </OtherBenefits>
          <Payment>
            <PaymentFrequency>
              <QuestionLabel>payment.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </PaymentFrequency>
            <InitialAccountQuestion>
              <QuestionLabel>payment.way</QuestionLabel>
              <Answer>UK bank or building society</Answer>
            </InitialAccountQuestion>
            <Account>
              <HolderName>Mr Test Casetwo</HolderName>
              <BuildingSocietyDetails>
                <AccountNumber>12345678</AccountNumber>
                <!--    <RollNumber>RollNumber0</RollNumber> -->
                <SortCode>090126</SortCode>
                <Name>Santander</Name>
              </BuildingSocietyDetails>
            </Account>
          </Payment>
          <OtherInformation>
            <WelshCommunication>
              <QuestionLabel>welsh.communication</QuestionLabel>
              <Answer>No</Answer>
            </WelshCommunication>
            <AdditionalInformation>
              <QuestionLabel>anything.else</QuestionLabel>
              <Answer>It takes too long to claim. But I can write a very long answer here. 2000 characters.</Answer>
            </AdditionalInformation>
          </OtherInformation>
          <Declaration>I am the customer and have completed the form myself.</Declaration>
          <EvidenceList>
            <RecipientAddress>
              <Line>CA Freepost</Line>
              <Line>Palatine House</Line>
              <Line>Preston</Line>
              <PostCode>PR1 1HN</PostCode>
            </RecipientAddress>
            <Evidence>
              <Title>Document you need to send us</Title>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
            </Evidence>
            <Evidence>
              <Title>Pay Details</Title>
              <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
            </Evidence>
            <Evidence>
              <Title>Statement Signed</Title>
              <Content>You need to send us the completed and signed statement.</Content>
            </Evidence>
          </EvidenceList>
          <Consents>
            <Consent>
              <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
            <Consent>
              <QuestionLabel>Another consent question</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
          </Consents>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
    </DWPBody>
  }

  def functionalTestCase6: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance file:/Users/jmi/Temp/CarersAllowance_Schema.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim>
          <DateOfClaim>
            <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
            <Answer>20-01-2013</Answer>
          </DateOfClaim>
          <Claimant>
            <Surname>CaseSix</Surname>
            <OtherNames>Test</OtherNames>
            <Title>Mr</Title>
            <DateOfBirth>01-01-1945</DateOfBirth>
            <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
            <Address>
              <Line>4 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <MaritalStatus>Married or civil partner</MaritalStatus>
          </Claimant>
          <Caree>
            <Surname>Person</Surname>
            <OtherNames>Cared For</OtherNames>
            <Title>Mr</Title>
            <DateOfBirth>10-12-1934</DateOfBirth>
            <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
            <Address>
              <Line>4 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <RelationToClaimant>
              <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
              <Answer>Father</Answer>
            </RelationToClaimant>
            <BreaksSinceClaim>
              <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
              <Answer>No</Answer>
            </BreaksSinceClaim>
          </Caree>
          <Residency>
            <NormallyLiveInGB>
              <QuestionLabel>live.normally.GB</QuestionLabel>
              <Answer>No</Answer>
            </NormallyLiveInGB>
            <CountryNormallyLive>
              <QuestionLabel>live.normally.country</QuestionLabel>
              <Answer>France</Answer>
            </CountryNormallyLive>
            <Nationality>British</Nationality>
            <TimeOutsideGBLast3Years>
              <QuestionLabel>Time.out.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </TimeOutsideGBLast3Years>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>08-09-2010</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>08-12-2010</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Other>Funeral</Other>
                <Answer>Other</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>France</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>No</Answer>
              </CareePresent>
            </PeriodAbroad>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>06-09-2011</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>06-12-2011</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Answer>Holiday</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>Spain</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>Yes</Answer>
              </CareePresent>
            </PeriodAbroad>
          </Residency>
          <CourseOfEducation>
            <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
            <Answer>No</Answer>
          </CourseOfEducation>
          <SelfEmployed>
            <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </SelfEmployed>
          <SelfEmployment>
            <SelfEmployedNow>
              <QuestionLabel>selfepmloyed.now</QuestionLabel>
              <Answer>No</Answer>
            </SelfEmployedNow>
            <RecentJobDetails>
              <DateStarted>
                <QuestionLabel>selfemployed.started</QuestionLabel>
                <Answer>05-01-2010</Answer>
              </DateStarted>
              <DateEnded>
                <QuestionLabel>selfemployed.ended</QuestionLabel>
                <Answer>31-03-2013</Answer>
              </DateEnded>
              <TradingCeased>
                <QuestionLabel>selfemployed.ceased</QuestionLabel>
                <Answer>Yes</Answer>
              </TradingCeased>
            </RecentJobDetails>
            <CareExpensesChildren>
              <QuestionLabel>self.child.expenses</QuestionLabel>
              <Answer>No</Answer>
            </CareExpensesChildren>

            <CareExpensesCaree>
              <QuestionLabel>self.care.expenses</QuestionLabel>
              <Answer>No</Answer>
            </CareExpensesCaree>

            <PaidForPension>
              <QuestionLabel>self.pension</QuestionLabel>
              <Answer>Yes</Answer>
            </PaidForPension>
            <PensionScheme>
              <Payment>
                <QuestionLabel>self.pension.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>15.23</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>self.pension.frequency</QuestionLabel>
                <Answer>Weekly</Answer>
              </Frequency>
            </PensionScheme>
          </SelfEmployment>
          <Employed>
            <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </Employed>
          <Employment>
            <CurrentlyEmployed>
              <QuestionLabel>employed.currently</QuestionLabel>
              <Answer>No</Answer>
            </CurrentlyEmployed>
            <JobDetails>

              <Employer>
                <DateJobStarted>
                  <QuestionLabel>job.started</QuestionLabel>
                  <Answer>01-01-2013</Answer>
                </DateJobStarted>
                <!--        <DateJobEnded>
                                            <QuestionLabel>job.ended</QuestionLabel>
                                            <Answer>2013-07-01</Answer>
                                        </DateJobEnded> -->
                <JobType>
                  <QuestionLabel>job.title</QuestionLabel>
                  <Answer>Hacker</Answer>
                </JobType>
                <ClockPayrollNumber>12345678</ClockPayrollNumber>
                <Name>Tesco's</Name>
                <Address>
                  <Line>23 Yeadon Way</Line>
                  <Line>Blackpool</Line>
                  <Line>Lancashire</Line>
                  <PostCode>FY4 5TH</PostCode>
                </Address>
                <EmployersPhoneNumber>01253 667889</EmployersPhoneNumber>
                <HaveFinishedJob>
                  <QuestionLabel>job.finished</QuestionLabel>
                  <Answer>No</Answer>
                </HaveFinishedJob>
                <!--               <P45LeavingDate>
                                            <QuestionLabel>job.p45</QuestionLabel>
                                            <Answer>2013-07-01</Answer>
                                        </P45LeavingDate> -->
              </Employer>
              <Pay>
                <WeeklyHoursWorked>
                  <QuestionLabel>job.hours</QuestionLabel>
                  <Answer>25</Answer>
                </WeeklyHoursWorked>
                <DateLastPaid>
                  <QuestionLabel>job.lastpaid</QuestionLabel>
                  <Answer>02-07-2013</Answer>
                </DateLastPaid>
                <GrossPayment>
                  <QuestionLabel>job.pay</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>600.00</Amount>
                  </Answer>
                </GrossPayment>
                <IncludedInWage>
                  <QuestionLabel>job.pay.include</QuestionLabel>
                  <Answer>All amounts due</Answer>
                </IncludedInWage>
                <PayFrequency>
                  <QuestionLabel>job.pay.frequency</QuestionLabel>
                  <Answer>Four-Weekly</Answer>
                </PayFrequency>
                <UsualPayDay>
                  <QuestionLabel>job.day</QuestionLabel>
                  <Answer>Wednesday usually</Answer>
                </UsualPayDay>
                <ConstantEarnings>
                  <QuestionLabel>job.same.amount</QuestionLabel>
                  <Answer>Yes</Answer>
                </ConstantEarnings>
              </Pay>
              <OweMoney>
                <QuestionLabel>job.owe</QuestionLabel>
                <Answer>No</Answer>
              </OweMoney>
              <CareExpensesChildren>
                <QuestionLabel>chld.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesChildren>
              <ChildCareExpenses>
                <CarerName>
                  <QuestionLabel>child.carer</QuestionLabel>
                  <Answer>Mr Grandfather Senior</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>child.care.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>120.12</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>child.care.frequency</QuestionLabel>
                    <Answer>Weekly</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>child.care.rel.claimant</QuestionLabel>
                  <Answer>Father</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToPartner>
                  <QuestionLabel>cild.care.rel.partner</QuestionLabel>
                  <Answer>Stepfather</Answer>
                </RelationshipCarerToPartner>
                <RelationToChild>
                  <QuestionLabel>child.care.rel.child</QuestionLabel>
                  <Answer>Grandfather</Answer>
                </RelationToChild>
              </ChildCareExpenses>
              <CareExpensesCaree>
                <QuestionLabel>care.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesCaree>
              <CareExpenses>
                <CarerName>
                  <QuestionLabel>care.carer</QuestionLabel>
                  <Answer>Carers UK Ltd</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>care.carer.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>150.55</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>care.carer.frequency</QuestionLabel>
                    <Other>Annually</Other>
                    <Answer>Other</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>care.carer.rel.claimant</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToPartner>
                  <QuestionLabel>care.carer.rel.partner</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToPartner>
                <RelationshipCarerToCaree>
                  <QuestionLabel>care.carer.rel.caree</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToCaree>
              </CareExpenses>
              <PaidForOccupationalPension>
                <QuestionLabel>pension.occupational</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForOccupationalPension>
              <OccupationalPension>
                <Payment>
                  <QuestionLabel>pension.occ.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>350.10</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.occ.frequency</QuestionLabel>
                  <Other>Other frequency fo occupational scheme</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </OccupationalPension>
              <PaidForPersonalPension>
                <QuestionLabel>pension.personal</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForPersonalPension>
              <PersonalPension>
                <Payment>
                  <QuestionLabel>pension.per.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>200.1</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.per.frequency</QuestionLabel>
                  <Answer>Monthly</Answer>
                </Frequency>
              </PersonalPension>
              <PaidForJobExpenses>
                <QuestionLabel>job.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForJobExpenses>
              <JobExpenses>
                <Expense>
                  <QuestionLabel>job.expense</QuestionLabel>
                  <Answer>Petrol money for driving</Answer>
                </Expense>
              </JobExpenses>
              <OtherEmployment>
                <QuestionLabel>Other.eployment</QuestionLabel>
                <Answer>No</Answer>
              </OtherEmployment>
            </JobDetails>
          </Employment>

          <HavePartner>
            <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
            <Answer>No</Answer>
          </HavePartner>

          <OtherBenefits>
            <ClaimantBenefits>
              <StatePension>
                <QuestionLabel>Do you get State Pension?</QuestionLabel>
                <Answer>No</Answer>
              </StatePension>
            </ClaimantBenefits>
            <OtherMoneySSP>
              <QuestionLabel>ssp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySSP>
            <OtherMoneySSPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>ssp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>12</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>ssp.frequency</QuestionLabel>
                  <Other>Every day and twice on Sundays</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>Burger King</Name>
              <Address>
                <Line>102 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySSPDetails>
            <OtherMoneySP>
              <QuestionLabel>sp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySP>
            <OtherMoneySPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>sp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>sp.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Payment>
              <Name>KFC</Name>
              <Address>
                <Line>104 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySPDetails>
            <OtherMoney>
              <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoney>
            <OtherMoneyDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>Other.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>123.57</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>Other.frequency</QuestionLabel>
                  <Other>Quarterly</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>
                <QuestionLabel>Other.who</QuestionLabel>
                <Answer>The Man</Answer>
              </Name>
            </OtherMoneyDetails>
            <EEA>
              <EEAClaimPensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAClaimPensionsBenefits>
              <EEAReceivePensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAReceivePensionsBenefits>
              <EEAWorkingInsurance>
                <QuestionLabel>eea.insurance</QuestionLabel>
                <Answer>No</Answer>
              </EEAWorkingInsurance>
            </EEA>

          </OtherBenefits>


          <Payment>
            <PaymentFrequency>
              <QuestionLabel>payment.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </PaymentFrequency>
            <InitialAccountQuestion>
              <QuestionLabel>payment.way</QuestionLabel>
              <Answer>UK bank or building society</Answer>
            </InitialAccountQuestion>
            <Account>
              <HolderName>Mr Test Casetwo</HolderName>
              <BuildingSocietyDetails>
                <AccountNumber>12345678</AccountNumber>
                <!--    <RollNumber>RollNumber0</RollNumber> -->
                <SortCode>090126</SortCode>
                <Name>Santander</Name>
              </BuildingSocietyDetails>
            </Account>
          </Payment>
          <OtherInformation/>
          <Declaration>I am the customer and have completed the form myself.</Declaration>
          <EvidenceList>
            <RecipientAddress>
              <Line>CA Freepost</Line>
              <Line>Palatine House</Line>
              <Line>Preston</Line>
              <PostCode>PR1 1HN</PostCode>
            </RecipientAddress>
            <Evidence>
              <Title>Document you need to send us</Title>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
            </Evidence>
            <Evidence>
              <Title>Pay Details</Title>
              <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
            </Evidence>
            <Evidence>
              <Title>Statement Signed</Title>
              <Content>You need to send us the completed and signed statement.</Content>
            </Evidence>
          </EvidenceList>
          <Consents>
            <Consent>
              <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
            <Consent>
              <QuestionLabel>Another consent question</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
          </Consents>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
    </DWPBody>
  }

  def functionalTestCase7: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance CarersAllowance_Schema_0.9.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>TEST432</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim>
          <DateOfClaim>
            <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
            <Answer>23-07-2013</Answer>
          </DateOfClaim>
          <Claimant>
            <Surname>CaseSeven</Surname>
            <OtherNames>Test</OtherNames>
            <OtherSurnames>Smithson</OtherSurnames>
            <Title>Miss</Title>
            <DateOfBirth>01-01-1949</DateOfBirth>
            <NationalInsuranceNumber>JB486278C</NationalInsuranceNumber>
            <Address>
              <Line>7 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <MobileNumber>0771 5419808</MobileNumber>
            <MaritalStatus>Single</MaritalStatus>
            <TextPhoneContact>
              <QuestionLabel>text.phone</QuestionLabel>
              <Answer>No</Answer>
            </TextPhoneContact>
          </Claimant>
          <Caree>
            <Surname>Caseseven</Surname>
            <OtherNames>Partner Middle</OtherNames>
            <OtherSurnames>Watson</OtherSurnames>
            <Title>Mrs</Title>
            <DateOfBirth>28-09-1977</DateOfBirth>
            <NationalInsuranceNumber>WA234567A</NationalInsuranceNumber>
            <Address>
              <Line>12 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01234 567890</DayTimePhoneNumber>
            <RelationToClaimant>
              <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
              <Answer>Father</Answer>
            </RelationToClaimant>
            <Cared35Hours>
              <QuestionLabel>Do you spend 35 hours or more each week caring for this person?</QuestionLabel>
              <Answer>No</Answer>
            </Cared35Hours>
            <BreaksSinceClaim>
              <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
              <Answer>Yes</Answer>
            </BreaksSinceClaim>
            <CareBreak>
              <StartDateTime>10-01-2010 10:15</StartDateTime>
              <EndDateTime>17-01-2010 17:45</EndDateTime>
              <ReasonClaimant>
                <QuestionLabel>Where were you during the break?</QuestionLabel>
                <Other>Friend's place</Other>
                <Answer>Hospital</Answer>
              </ReasonClaimant>
              <ReasonCaree>
                <QuestionLabel>Where was the person you care for during the break?</QuestionLabel>
                <Answer>At Home</Answer>
              </ReasonCaree>
              <MedicalCare>
                <QuestionLabel>Did you or the person you care for receive any medical treatment or professional care during the break?</QuestionLabel>
                <Answer>Yes</Answer>
              </MedicalCare>
            </CareBreak>

            <Cared35HoursBefore>
              <QuestionLabel>care.35.before</QuestionLabel>
              <Answer>No</Answer>
            </Cared35HoursBefore>
            <DateStartCaring>
              <QuestionLabel>care.started</QuestionLabel>
              <Answer>05-01-2010</Answer>
            </DateStartCaring>
            <LiveSameAddress>
              <QuestionLabel>caree.sameadrees</QuestionLabel>
              <Answer>Yes</Answer>
            </LiveSameAddress>
            <ArmedForcesIndependencePayment>
              <QuestionLabel>Does this person get Armed Forces Independence Payment?</QuestionLabel>
              <Answer>No</Answer>
            </ArmedForcesIndependencePayment>
          </Caree>
          <Residency>
            <NormallyLiveInGB>
              <QuestionLabel>live.normally.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </NormallyLiveInGB>
            <CountryNormallyLive>
              <QuestionLabel>live.normally.country</QuestionLabel>
              <Answer>France</Answer>
            </CountryNormallyLive>
            <Nationality>British</Nationality>
            <TimeOutsideGBLast3Years>
              <QuestionLabel>Time.out.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </TimeOutsideGBLast3Years>

          </Residency>
          <CourseOfEducation>
            <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
            <Answer>No</Answer>
          </CourseOfEducation>

          <SelfEmployed>
            <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
            <Answer>No</Answer>
          </SelfEmployed>

          <Employed>
            <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </Employed>
          <Employment>
            <CurrentlyEmployed>
              <QuestionLabel>employed.currently</QuestionLabel>
              <Answer>No</Answer>
            </CurrentlyEmployed>
            <JobDetails>
              <Employer>
                <DateJobStarted>
                  <QuestionLabel>job.started</QuestionLabel>
                  <Answer>03-05-2010</Answer>
                </DateJobStarted>
                <DateJobEnded>
                  <QuestionLabel>job.ended</QuestionLabel>
                  <Answer>24-12-2010</Answer>
                </DateJobEnded>
                <JobType>
                  <QuestionLabel>job.title</QuestionLabel>
                  <Answer>Hacker</Answer>
                </JobType>
                <ClockPayrollNumber>12345678</ClockPayrollNumber>
                <Name>Tesco's</Name>
                <Address>
                  <Line>9923 Yeadon Way</Line>
                  <Line>Blackpool</Line>
                  <Line>Lancashire</Line>
                  <PostCode>FY4 5TH</PostCode>
                </Address>
                <EmployersPhoneNumber>01253 667889</EmployersPhoneNumber>
                <HaveFinishedJob>
                  <QuestionLabel>job.finished</QuestionLabel>
                  <Answer>No</Answer>
                </HaveFinishedJob>
                <P45LeavingDate>
                  <QuestionLabel>job.p45</QuestionLabel>
                  <Answer>24-12-2010</Answer>
                </P45LeavingDate>
              </Employer>
              <Pay>
                <WeeklyHoursWorked>
                  <QuestionLabel>job.hours</QuestionLabel>
                  <Answer>25</Answer>
                </WeeklyHoursWorked>
                <DateLastPaid>
                  <QuestionLabel>job.lastpaid</QuestionLabel>
                  <Answer>24-12-2010</Answer>
                </DateLastPaid>
                <GrossPayment>
                  <QuestionLabel>job.pay</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>600.00</Amount>
                  </Answer>
                </GrossPayment>
                <IncludedInWage>
                  <QuestionLabel>job.pay.include</QuestionLabel>
                  <Answer>Everything including christmas bonus !!?</Answer>
                </IncludedInWage>
                <PayFrequency>
                  <QuestionLabel>job.pay.frequency</QuestionLabel>
                  <Answer>Four-Weekly</Answer>
                </PayFrequency>
                <UsualPayDay>
                  <QuestionLabel>job.day</QuestionLabel>
                  <Answer>Wednesday usually</Answer>
                </UsualPayDay>
                <ConstantEarnings>
                  <QuestionLabel>job.same.amount</QuestionLabel>
                  <Answer>Yes</Answer>
                </ConstantEarnings>
              </Pay>
              <OweMoney>
                <QuestionLabel>job.owe</QuestionLabel>
                <Answer>No</Answer>
              </OweMoney>
              <CareExpensesChildren>
                <QuestionLabel>chld.expenses</QuestionLabel>
                <Answer>No</Answer>
              </CareExpensesChildren>

              <CareExpensesCaree>
                <QuestionLabel>care.expenses</QuestionLabel>
                <Answer>No</Answer>
              </CareExpensesCaree>
              <PaidForOccupationalPension>
                <QuestionLabel>pension.occupational</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForOccupationalPension>
              <OccupationalPension>
                <Payment>
                  <QuestionLabel>pension.occ.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>100.00</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.occ.frequency</QuestionLabel>
                  <Other>Other frequency fo occupational scheme</Other>
                  <Answer>Weekly</Answer>
                </Frequency>
              </OccupationalPension>
              <PaidForPersonalPension>
                <QuestionLabel>pension.personal</QuestionLabel>
                <Answer>No</Answer>
              </PaidForPersonalPension>

              <PaidForJobExpenses>
                <QuestionLabel>job.expenses</QuestionLabel>
                <Answer>No</Answer>
              </PaidForJobExpenses>

              <OtherEmployment>
                <QuestionLabel>Other.eployment</QuestionLabel>
                <Answer>No</Answer>
              </OtherEmployment>
            </JobDetails>
          </Employment>
          <HavePartner>
            <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </HavePartner>
          <Partner>
            <Surname>Caseseven</Surname>
            <OtherNames>Partner Middle</OtherNames>
            <OtherSurnames>Dixon</OtherSurnames>
            <Title>Mrs</Title>
            <DateOfBirth>28-09-1977</DateOfBirth>
            <NationalInsuranceNumber>WA234567A</NationalInsuranceNumber>
            <!-- <Address>
                            <Line>Line4</Line>
                            <PostCode>GIR 0AA</PostCode>
                        </Address>

                        <MobileNumber>       </MobileNumber> -->
            <DayTimePhoneNumber>0987654321</DayTimePhoneNumber>
            <NationalityPartner>Spanish</NationalityPartner>
            <RelationshipStatus>
              <SeparatedFromPartner>
                <QuestionLabel>partner.separated</QuestionLabel>
                <Answer>No</Answer>
              </SeparatedFromPartner>
            </RelationshipStatus>
            <IsCaree>
              <QuestionLabel>Is your partner/spouse the person you are claiming Carer's Allowance for?</QuestionLabel>
              <Answer>No</Answer>
            </IsCaree>
          </Partner>
          <OtherBenefits>
            <ClaimantBenefits>
              <StatePension>
                <QuestionLabel>Do you get State Pension?</QuestionLabel>
                <Answer>No</Answer>
              </StatePension>
            </ClaimantBenefits>
            <OtherMoneySP>
              <QuestionLabel>sp.money</QuestionLabel>
              <Answer>No</Answer>
            </OtherMoneySP>

            <OtherMoney>
              <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
              <Answer>No</Answer>
            </OtherMoney>

            <EEA>
              <EEAClaimPensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>No</Answer>
              </EEAClaimPensionsBenefits>
              <EEAReceivePensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>No</Answer>
              </EEAReceivePensionsBenefits>
              <EEAWorkingInsurance>
                <QuestionLabel>eea.insurance</QuestionLabel>
                <Answer>No</Answer>
              </EEAWorkingInsurance>
            </EEA>

          </OtherBenefits>
          <Payment>
            <PaymentFrequency>
              <QuestionLabel>payment.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </PaymentFrequency>
            <InitialAccountQuestion>
              <QuestionLabel>payment.way</QuestionLabel>
              <Answer>UK bank or building society</Answer>
            </InitialAccountQuestion>
            <Account>
              <HolderName>Mr Test Caseseven</HolderName>
              <BuildingSocietyDetails>
                <AccountNumber>12345678</AccountNumber>
                <RollNumber>1230000000002</RollNumber>
                <SortCode>090123</SortCode>
                <Name>Barclays</Name>
              </BuildingSocietyDetails>
            </Account>
          </Payment>
          <OtherInformation>
            <WelshCommunication>
              <QuestionLabel>welsh.communication</QuestionLabel>
              <Answer>No</Answer>
            </WelshCommunication>
            <AdditionalInformation>
              <QuestionLabel>anything.else</QuestionLabel>
              <Answer>It takes too long to claim. But I can write a very long answer here. 2000 characters.</Answer>
            </AdditionalInformation>
          </OtherInformation>
          <Declaration>I am the customer and have completed the form myself.</Declaration>
          <EvidenceList>
            <RecipientAddress>
              <Line>CA Freepost</Line>
              <Line>Palatine House</Line>
              <Line>Preston</Line>
              <PostCode>PR1 1HN</PostCode>
            </RecipientAddress>
            <Evidence>
              <Title>Document you need to send us</Title>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
            </Evidence>
            <Evidence>
              <Title>Pay Details</Title>
              <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
            </Evidence>
            <Evidence>
              <Title>Statement Signed</Title>
              <Content>You need to send us the completed and signed statement.</Content>
            </Evidence>
          </EvidenceList>
          <Consents>
            <Consent>
              <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
            <Consent>
              <QuestionLabel>Another consent question</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
          </Consents>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
    </DWPBody>
  }

  def functionalTestCase8: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance file:/Users/jmi/Temp/CarersAllowance_Schema.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim>
          <DateOfClaim>
            <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
            <Answer>20-06-2013</Answer>
          </DateOfClaim>
          <Claimant>
            <Surname>CaseSix</Surname>
            <OtherNames>Test</OtherNames>
            <OtherSurnames> </OtherSurnames>
            <Title>Mr</Title>
            <DateOfBirth>01-01-1945</DateOfBirth>
            <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
            <Address>
              <Line>4 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <MaritalStatus>Married or civil partner</MaritalStatus>
          </Claimant>
          <Caree>
            <Surname>Person</Surname>
            <OtherNames>Cared For</OtherNames>
            <Title>Mr</Title>
            <DateOfBirth>12-10-1934</DateOfBirth>
            <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
            <Address>
              <Line>4 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <RelationToClaimant>
              <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
              <Answer>Father</Answer>
            </RelationToClaimant>
            <BreaksSinceClaim>
              <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
              <Answer>No</Answer>
            </BreaksSinceClaim>
          </Caree>
          <Residency>
            <NormallyLiveInGB>
              <QuestionLabel>live.normally.GB</QuestionLabel>
              <Answer>No</Answer>
            </NormallyLiveInGB>
            <CountryNormallyLive>
              <QuestionLabel>live.normally.country</QuestionLabel>
              <Answer>France</Answer>
            </CountryNormallyLive>
            <Nationality>British</Nationality>
            <TimeOutsideGBLast3Years>
              <QuestionLabel>Time.out.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </TimeOutsideGBLast3Years>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>08-09-2010</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>08-12-2010</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Other>Funeral</Other>
                <Answer>Other</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>France</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>No</Answer>
              </CareePresent>
            </PeriodAbroad>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>06-09-2011</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>06-12-2011</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Answer>Holiday</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>Spain</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>Yes</Answer>
              </CareePresent>
            </PeriodAbroad>
          </Residency>
          <CourseOfEducation>
            <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
            <Answer>Yes</Answer>
          </CourseOfEducation>
          <FullTimeEducation>
            <CourseDetails>
              <Type>BA honours in Business</Type>
              <Title>Bussines Studies</Title>
              <DateStarted>
                <QuestionLabel>education.started</QuestionLabel>
                <Answer>01-01-2013</Answer>
              </DateStarted>
              <ExpectedEndDate>
                <QuestionLabel>education.end.expected</QuestionLabel>
                <Answer>05-01-2014</Answer>
              </ExpectedEndDate>
            </CourseDetails>
            <LocationDetails>
              <Name>Oxford College</Name>
              <Address>
                <Line>1 Oxford Road</Line>
                <Line>Oxford</Line>
                <Line>Oxfordshire</Line>
                <PostCode>OX12 3RT</PostCode>
              </Address>
              <PhoneNumber>01776 829920</PhoneNumber>
              <FaxNumber>01776 829920</FaxNumber>
              <StudentReferenceNumber>91982</StudentReferenceNumber>
              <Tutor>My Tutor</Tutor>
            </LocationDetails>
          </FullTimeEducation>
          <SelfEmployed>
            <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </SelfEmployed>
          <SelfEmployment>
            <SelfEmployedNow>
              <QuestionLabel>selfepmloyed.now</QuestionLabel>
              <Answer>No</Answer>
            </SelfEmployedNow>
            <RecentJobDetails>
              <DateStarted>
                <QuestionLabel>selfemployed.started</QuestionLabel>
                <Answer>05-01-2010</Answer>
              </DateStarted>
              <NatureBusiness>
                <QuestionLabel>selfemployed.business</QuestionLabel>
                <Answer>Fruit and veg, delivery service</Answer>
              </NatureBusiness>
              <TradingYear>
                <DateFrom>
                  <QuestionLabel>trading.from</QuestionLabel>
                  <Answer>05-01-2013</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>trading.to</QuestionLabel>
                  <Answer>30-04-2014</Answer>
                </DateTo>
              </TradingYear>
              <SameIncomeOutgoingLevels>
                <QuestionLabel>selfemployed.level</QuestionLabel>
                <Answer>No</Answer>
              </SameIncomeOutgoingLevels>
              <WhyWhenChange>
                <QuestionLabel>slefemployed.level.change</QuestionLabel>
                <Answer>Depends on the seasons, and productivity of the fruit.</Answer>
              </WhyWhenChange>
              <DateEnded>
                <QuestionLabel>selfemployed.ended</QuestionLabel>
                <Answer>01-09-2013</Answer>
              </DateEnded>
              <TradingCeased>
                <QuestionLabel>selfemployed.ceased</QuestionLabel>
                <Answer>Yes</Answer>
              </TradingCeased>
            </RecentJobDetails>
            <CareExpensesChildren>
              <QuestionLabel>self.child.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesChildren>
            <ChildCareExpenses>
              <CarerName>
                <QuestionLabel>self.child.carer</QuestionLabel>
                <Answer>Mr ChildCare</Answer>
              </CarerName>
              <Expense>
                <Payment>
                  <QuestionLabel>self.child.care.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120.00</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>self.child.care.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Expense>
              <RelationshipCarerToClaimant>
                <QuestionLabel>self.child.rel.claimant</QuestionLabel>
                <Answer>Uncle</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToPartner>
                <QuestionLabel>self.child.rel.partner</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToPartner>
              <RelationToChild>
                <QuestionLabel>self.child.rel.child</QuestionLabel>
                <Answer>Uncle</Answer>
              </RelationToChild>
            </ChildCareExpenses>
            <CareExpensesCaree>
              <QuestionLabel>self.care.expenses</QuestionLabel>
              <Answer>Yes</Answer>
            </CareExpensesCaree>
            <CareExpenses>
              <CarerName>
                <QuestionLabel>self.care.carer</QuestionLabel>
                <Answer>Mr Smith</Answer>
              </CarerName>
              <Expense>
                <Payment>
                  <QuestionLabel>self.care.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>400.00</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>self.care.frequency</QuestionLabel>
                  <Other>Other expenses frequency</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Expense>
              <RelationshipCarerToClaimant>
                <QuestionLabel>self.care.rel.claimant</QuestionLabel>
                <Other>None</Other>
                <Answer>Other</Answer>
              </RelationshipCarerToClaimant>
              <RelationshipCarerToPartner>
                <QuestionLabel>self.care.rel.partner</QuestionLabel>
                <Answer>Aunt</Answer>
              </RelationshipCarerToPartner>
              <RelationshipCarerToCaree>
                <QuestionLabel>self.care.rel.caree</QuestionLabel>
                <Answer>Aunt</Answer>
              </RelationshipCarerToCaree>
            </CareExpenses>
            <PaidForPension>
              <QuestionLabel>self.pension</QuestionLabel>
              <Answer>Yes</Answer>
            </PaidForPension>
            <PensionScheme>
              <Payment>
                <QuestionLabel>self.pension.amount</QuestionLabel>
                <Answer>
                  <Currency>GBP</Currency>
                  <Amount>15.23</Amount>
                </Answer>
              </Payment>
              <Frequency>
                <QuestionLabel>self.pension.frequency</QuestionLabel>
                <Answer>Weekly</Answer>
              </Frequency>
            </PensionScheme>
          </SelfEmployment>
          <Employed>
            <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
            <Answer>Yes</Answer>
          </Employed>
          <Employment>
            <CurrentlyEmployed>
              <QuestionLabel>employed.currently</QuestionLabel>
              <Answer>No</Answer>
            </CurrentlyEmployed>
            <JobDetails>
              <Employer>
                <DateJobStarted>
                  <QuestionLabel>job.started</QuestionLabel>
                  <Answer>01-01-2013</Answer>
                </DateJobStarted>
                <DateJobEnded>
                  <QuestionLabel>job.ended</QuestionLabel>
                  <Answer>01-07-2013</Answer>
                </DateJobEnded>
                <JobType>
                  <QuestionLabel>job.title</QuestionLabel>
                  <Answer>Hacker</Answer>
                </JobType>
                <ClockPayrollNumber>12345678</ClockPayrollNumber>
                <Name>Tesco's</Name>
                <Address>
                  <Line>23 Yeadon Way</Line>
                  <Line>Blackpool</Line>
                  <Line>Lancashire</Line>
                  <PostCode>FY4 5TH</PostCode>
                </Address>
                <EmployersPhoneNumber>01253 667889</EmployersPhoneNumber>
                <HaveFinishedJob>
                  <QuestionLabel>job.finished</QuestionLabel>
                  <Answer>No</Answer>
                </HaveFinishedJob>
                <P45LeavingDate>
                  <QuestionLabel>job.p45</QuestionLabel>
                  <Answer>01-07-2013</Answer>
                </P45LeavingDate>
              </Employer>
              <Pay>
                <WeeklyHoursWorked>
                  <QuestionLabel>job.hours</QuestionLabel>
                  <Answer>25</Answer>
                </WeeklyHoursWorked>
                <DateLastPaid>
                  <QuestionLabel>job.lastpaid</QuestionLabel>
                  <Answer>02-07-2013</Answer>
                </DateLastPaid>
                <GrossPayment>
                  <QuestionLabel>job.pay</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>600.00</Amount>
                  </Answer>
                </GrossPayment>
                <IncludedInWage>
                  <QuestionLabel>job.pay.include</QuestionLabel>
                  <Answer>All amounts due</Answer>
                </IncludedInWage>
                <PayFrequency>
                  <QuestionLabel>job.pay.frequency</QuestionLabel>
                  <Answer>Four-Weekly</Answer>
                </PayFrequency>
                <UsualPayDay>
                  <QuestionLabel>job.day</QuestionLabel>
                  <Answer>Wednesday usually</Answer>
                </UsualPayDay>
                <ConstantEarnings>
                  <QuestionLabel>job.same.amount</QuestionLabel>
                  <Answer>Yes</Answer>
                </ConstantEarnings>
              </Pay>
              <OweMoney>
                <QuestionLabel>job.owe</QuestionLabel>
                <Answer>No</Answer>
              </OweMoney>
              <CareExpensesChildren>
                <QuestionLabel>chld.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesChildren>
              <ChildCareExpenses>
                <CarerName>
                  <QuestionLabel>child.carer</QuestionLabel>
                  <Answer>Mr Grandfather Senior</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>child.care.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>120.12</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>child.care.frequency</QuestionLabel>
                    <Answer>Weekly</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>child.care.rel.claimant</QuestionLabel>
                  <Answer>Father</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToPartner>
                  <QuestionLabel>cild.care.rel.partner</QuestionLabel>
                  <Answer>Stepfather</Answer>
                </RelationshipCarerToPartner>
                <RelationToChild>
                  <QuestionLabel>child.care.rel.child</QuestionLabel>
                  <Answer>Grandfather</Answer>
                </RelationToChild>
              </ChildCareExpenses>
              <CareExpensesCaree>
                <QuestionLabel>care.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </CareExpensesCaree>
              <CareExpenses>
                <CarerName>
                  <QuestionLabel>care.carer</QuestionLabel>
                  <Answer>Carers UK Ltd</Answer>
                </CarerName>
                <Expense>
                  <Payment>
                    <QuestionLabel>care.carer.amount</QuestionLabel>
                    <Answer>
                      <Currency>GBP</Currency>
                      <Amount>150.55</Amount>
                    </Answer>
                  </Payment>
                  <Frequency>
                    <QuestionLabel>care.carer.frequency</QuestionLabel>
                    <Other>Annually</Other>
                    <Answer>Other</Answer>
                  </Frequency>
                </Expense>
                <RelationshipCarerToClaimant>
                  <QuestionLabel>care.carer.rel.claimant</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToClaimant>
                <RelationshipCarerToPartner>
                  <QuestionLabel>care.carer.rel.partner</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToPartner>
                <RelationshipCarerToCaree>
                  <QuestionLabel>care.carer.rel.caree</QuestionLabel>
                  <Other>None</Other>
                  <Answer>Other</Answer>
                </RelationshipCarerToCaree>
              </CareExpenses>
              <PaidForOccupationalPension>
                <QuestionLabel>pension.occupational</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForOccupationalPension>
              <OccupationalPension>
                <Payment>
                  <QuestionLabel>pension.occ.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>350.10</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.occ.frequency</QuestionLabel>
                  <Other>Other frequency fo occupational scheme</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </OccupationalPension>
              <PaidForPersonalPension>
                <QuestionLabel>pension.personal</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForPersonalPension>
              <PersonalPension>
                <Payment>
                  <QuestionLabel>pension.per.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>200.1</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>pension.per.frequency</QuestionLabel>
                  <Answer>Monthly</Answer>
                </Frequency>
              </PersonalPension>
              <PaidForJobExpenses>
                <QuestionLabel>job.expenses</QuestionLabel>
                <Answer>Yes</Answer>
              </PaidForJobExpenses>
              <JobExpenses>
                <Expense>
                  <QuestionLabel>job.expense</QuestionLabel>
                  <Answer>Petrol money for driving</Answer>
                </Expense>
              </JobExpenses>
              <OtherEmployment>
                <QuestionLabel>Other.eployment</QuestionLabel>
                <Answer>No</Answer>
              </OtherEmployment>
            </JobDetails>
          </Employment>

          <HavePartner>
            <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
            <Answer>No</Answer>
          </HavePartner>

          <OtherBenefits>
            <ClaimantBenefits>
              <StatePension>
                <QuestionLabel>Do you get State Pension?</QuestionLabel>
                <Answer>Yes</Answer>
              </StatePension>
            </ClaimantBenefits>
            <OtherMoneySSP>
              <QuestionLabel>ssp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySSP>
            <OtherMoneySSPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>ssp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>12</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>ssp.frequency</QuestionLabel>
                  <Other>Every day and twice on Sundays</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>Burger King</Name>
              <Address>
                <Line>102 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySSPDetails>
            <OtherMoneySP>
              <QuestionLabel>sp.money</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoneySP>
            <OtherMoneySPDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>sp.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>120</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>sp.frequency</QuestionLabel>
                  <Answer>Weekly</Answer>
                </Frequency>
              </Payment>
              <Name>KFC</Name>
              <Address>
                <Line>104 Preston Road</Line>
                <Line>Preston</Line>
                <Line>Lancashire</Line>
                <PostCode>PR45 6YH</PostCode>
              </Address>
            </OtherMoneySPDetails>
            <OtherMoney>
              <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
              <Answer>Yes</Answer>
            </OtherMoney>
            <OtherMoneyDetails>
              <Payment>
                <Payment>
                  <QuestionLabel>Other.amount</QuestionLabel>
                  <Answer>
                    <Currency>GBP</Currency>
                    <Amount>123.57</Amount>
                  </Answer>
                </Payment>
                <Frequency>
                  <QuestionLabel>Other.frequency</QuestionLabel>
                  <Other>Quarterly</Other>
                  <Answer>Other</Answer>
                </Frequency>
              </Payment>
              <Name>
                <QuestionLabel>Other.who</QuestionLabel>
                <Answer>The Man</Answer>
              </Name>
            </OtherMoneyDetails>
            <EEA>
              <EEAClaimPensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAClaimPensionsBenefits>
              <EEAReceivePensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>Yes</Answer>
              </EEAReceivePensionsBenefits>
              <EEAWorkingInsurance>
                <QuestionLabel>eea.insurance</QuestionLabel>
                <Answer>No</Answer>
              </EEAWorkingInsurance>
            </EEA>

          </OtherBenefits>
          <Payment>
            <PaymentFrequency>
              <QuestionLabel>payment.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </PaymentFrequency>
            <InitialAccountQuestion>
              <QuestionLabel>payment.way</QuestionLabel>
              <Answer>UK bank or building society</Answer>
            </InitialAccountQuestion>
            <Account>
              <HolderName>Mr Test Casetwo</HolderName>
              <BuildingSocietyDetails>
                <AccountNumber>12345678</AccountNumber>
                <!--    <RollNumber>RollNumber0</RollNumber> -->
                <SortCode>090126</SortCode>
                <Name>Santander</Name>
              </BuildingSocietyDetails>
            </Account>
          </Payment>
          <OtherInformation/>
          <Declaration>I am the customer and have completed the form myself.</Declaration>
          <EvidenceList>
            <RecipientAddress>
              <Line>CA Freepost</Line>
              <Line>Palatine House</Line>
              <Line>Preston</Line>
              <PostCode>PR1 1HN</PostCode>
            </RecipientAddress>
            <Evidence>
              <Title>Document you need to send us</Title>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
            </Evidence>
            <Evidence>
              <Title>Pay Details</Title>
              <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
            </Evidence>
            <Evidence>
              <Title>Statement Signed</Title>
              <Content>You need to send us the completed and signed statement.</Content>
            </Evidence>
          </EvidenceList>
          <Consents>
            <Consent>
              <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
            <Consent>
              <QuestionLabel>Another consent question</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
          </Consents>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
      </DWPBody>
  }


  def functionalTestCase9: Elem = {
    <DWPBody xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns="http://www.govtalk.gov.uk/dwp/carers-allowance"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.govtalk.gov.uk/dwp/carers-allowance CarersAllowance_Schema_0.9.xsd">
      <Version>0.1</Version>
      <DWPCATransaction>
        <TransactionId>NFM33DB</TransactionId>
        <DateTimeGenerated>02-10-2010 14:36</DateTimeGenerated>
        <DWPCAClaim>
          <DateOfClaim>
            <QuestionLabel>When do you want your Carer's Allowance claim to start?</QuestionLabel>
            <Answer>21-07-2013</Answer>
          </DateOfClaim>
          <Claimant>
            <Surname>Casenine</Surname>
            <OtherNames>Test</OtherNames>
            <OtherSurnames>Smithson</OtherSurnames>
            <Title>Mr</Title>
            <DateOfBirth>28-09-1976</DateOfBirth>
            <NationalInsuranceNumber>JB486278C</NationalInsuranceNumber>
            <Address>
              <Line>9 Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01772 888901</DayTimePhoneNumber>
            <MobileNumber>0771 5419808</MobileNumber>
            <MaritalStatus>Living with partner</MaritalStatus>
            <TextPhoneContact>
              <QuestionLabel>text.phone</QuestionLabel>
              <Answer>No</Answer>
            </TextPhoneContact>
          </Claimant>
          <Caree>
            <Surname>CaseNine</Surname>
            <OtherNames>Test</OtherNames>
            <OtherSurnames>Watson</OtherSurnames>
            <Title>Dame</Title>
            <DateOfBirth>12-09-1980</DateOfBirth>
            <NationalInsuranceNumber>BA234567A</NationalInsuranceNumber>
            <Address>
              <Line>3a Preston Road</Line>
              <Line>Preston</Line>
              <Line>Lancashire</Line>
              <PostCode>PR1 2TH</PostCode>
            </Address>
            <DayTimePhoneNumber>01234 567890</DayTimePhoneNumber>
            <RelationToClaimant>
              <QuestionLabel>What's their relationshipt to you?</QuestionLabel>
              <Answer>Partner</Answer>
            </RelationToClaimant>
            <Cared35Hours>
              <QuestionLabel>Do you spend 35 hours or more each week caring for this person?</QuestionLabel>
              <Answer>No</Answer>
            </Cared35Hours>
            <BreaksSinceClaim>
              <QuestionLabel>Have you had any breaks in caring for this person since claim date?</QuestionLabel>
              <Answer>No</Answer>
            </BreaksSinceClaim>

            <Cared35HoursBefore>
              <QuestionLabel>care.35.before</QuestionLabel>
              <Answer>No</Answer>
            </Cared35HoursBefore>
            <DateStartCaring>
              <QuestionLabel>care.started</QuestionLabel>
              <Answer>21-01-2012</Answer>
            </DateStartCaring>
            <LiveSameAddress>
              <QuestionLabel>caree.sameadrees</QuestionLabel>
              <Answer>Yes</Answer>
            </LiveSameAddress>
            <ArmedForcesIndependencePayment>
              <QuestionLabel>Does this person get Armed Forces Independence Payment?</QuestionLabel>
              <Answer>No</Answer>
            </ArmedForcesIndependencePayment>
          </Caree>
          <Residency>
            <NormallyLiveInGB>
              <QuestionLabel>live.normally.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </NormallyLiveInGB>
            <CountryNormallyLive>
              <QuestionLabel>live.normally.country</QuestionLabel>
              <Answer>France</Answer>
            </CountryNormallyLive>
            <Nationality>British</Nationality>
            <TimeOutsideGBLast3Years>
              <QuestionLabel>Time.out.GB</QuestionLabel>
              <Answer>Yes</Answer>
            </TimeOutsideGBLast3Years>
            <PeriodAbroad>
              <Period>
                <DateFrom>
                  <QuestionLabel>abroad.date.from</QuestionLabel>
                  <Answer>08-09-2010</Answer>
                </DateFrom>
                <DateTo>
                  <QuestionLabel>abroad.date.to</QuestionLabel>
                  <Answer>08-12-2010</Answer>
                </DateTo>
              </Period>
              <Reason>
                <QuestionLabel>abroad.reason</QuestionLabel>
                <Other>Funeral</Other>
                <Answer>Other</Answer>
              </Reason>
              <Country>
                <QuestionLabel>country.went</QuestionLabel>
                <Answer>Croatia</Answer>
              </Country>
              <CareePresent>
                <QuestionLabel>caree.present</QuestionLabel>
                <Answer>No</Answer>
              </CareePresent>
            </PeriodAbroad>

          </Residency>
          <CourseOfEducation>
            <QuestionLabel>Have you been on a course of education since your claim date?</QuestionLabel>
            <Answer>No</Answer>
          </CourseOfEducation>

          <SelfEmployed>
            <QuestionLabel>Have you been self-employed at any time since (this is one week before your claim date)?</QuestionLabel>
            <Answer>No</Answer>
          </SelfEmployed>

          <Employed>
            <QuestionLabel>Have you been employed at any time since (this is six months before your claim date)?</QuestionLabel>
            <Answer>No</Answer>
          </Employed>

          <HavePartner>
            <QuestionLabel>Have you had a partner/spouse living with you since your claim date?</QuestionLabel>
            <Answer>No</Answer>
          </HavePartner>

          <OtherBenefits>
            <ClaimantBenefits>
              <StatePension>
                <QuestionLabel>Do you get State Pension?</QuestionLabel>
                <Answer>No</Answer>
              </StatePension>
            </ClaimantBenefits>
            <OtherMoneySSP>
              <QuestionLabel>ssp.money</QuestionLabel>
              <Answer>No</Answer>
            </OtherMoneySSP>

            <OtherMoneySP>
              <QuestionLabel>sp.money</QuestionLabel>
              <Answer>No</Answer>
            </OtherMoneySP>

            <OtherMoney>
              <QuestionLabel>Have you or your Partner or Spouse claimed or received any other benefits since the date you want to claim?</QuestionLabel>
              <Answer>No</Answer>
            </OtherMoney>

            <EEA>
              <EEAClaimPensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>No</Answer>
              </EEAClaimPensionsBenefits>
              <EEAReceivePensionsBenefits>
                <QuestionLabel>eea.pension</QuestionLabel>
                <Answer>No</Answer>
              </EEAReceivePensionsBenefits>
              <EEAWorkingInsurance>
                <QuestionLabel>eea.insurance</QuestionLabel>
                <Answer>No</Answer>
              </EEAWorkingInsurance>
            </EEA>

          </OtherBenefits>
          <Payment>
            <PaymentFrequency>
              <QuestionLabel>payment.frequency</QuestionLabel>
              <Answer>Weekly</Answer>
            </PaymentFrequency>
            <InitialAccountQuestion>
              <QuestionLabel>payment.way</QuestionLabel>
              <Answer>UK bank or building society</Answer>
            </InitialAccountQuestion>
            <Account>
              <HolderName>Mr Test Casetwo</HolderName>
              <BuildingSocietyDetails>
                <AccountNumber>12345678</AccountNumber>
                <!--    <RollNumber>RollNumber0</RollNumber> -->
                <SortCode>090126</SortCode>
                <Name>Santander</Name>
              </BuildingSocietyDetails>
            </Account>
          </Payment>
          <OtherInformation>
            <WelshCommunication>
              <QuestionLabel>welsh.communication</QuestionLabel>
              <Answer>No</Answer>
            </WelshCommunication>
            <AdditionalInformation>
              <QuestionLabel>anything.else</QuestionLabel>
              <Answer>It takes too long to claim. But I can write a very long answer here. 2000 characters.</Answer>
            </AdditionalInformation>
          </OtherInformation>
          <Declaration>I am the customer and have completed the form myself.</Declaration>
          <EvidenceList>
            <RecipientAddress>
              <Line>CA Freepost</Line>
              <Line>Palatine House</Line>
              <Line>Preston</Line>
              <PostCode>PR1 1HN</PostCode>
            </RecipientAddress>
            <Evidence>
              <Title>Document you need to send us</Title>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 1</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 2</Content>
              <Content>You must send us all the documents we ask for. If you do not, any benefit you may be entitled to my be delayed because of this claim. 3</Content>
            </Evidence>
            <Evidence>
              <Title>Pay Details</Title>
              <Content>You need to send us the last payslip before 10 Ocotber 2013 and all the payslips you have since then.</Content>
            </Evidence>
            <Evidence>
              <Title>Statement Signed</Title>
              <Content>You need to send us the completed and signed statement.</Content>
            </Evidence>
          </EvidenceList>
          <Consents>
            <Consent>
              <QuestionLabel>An example of a very long consent question so we can see the impact on the report and be sure that everything flows properly. Whenever there are multiple entries in an XML, one has to create subreport.</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
            <Consent>
              <QuestionLabel>Another consent question</QuestionLabel>
              <Answer>Yes</Answer>
            </Consent>
          </Consents>
        </DWPCAClaim>
      </DWPCATransaction>
      <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
        <ds:SignedInfo>
          <ds:CanonicalizationMethod Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"/>
          <ds:SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
          <ds:Reference URI="DWPCATransaction">
            <ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/>
            <ds:DigestValue>SadVcIUbeepTfvhp2BzI2V3EPYo=</ds:DigestValue>
          </ds:Reference>
        </ds:SignedInfo>
        <ds:SignatureValue>V6NzTYMiickLrbenHakT1UTnawk7CxWpqPtOh++XyCpg94LlWT682A==</ds:SignatureValue>
      </ds:Signature>
    </DWPBody>
  }
}