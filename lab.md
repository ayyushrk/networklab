mtech@programming-lab:~$ sudo apt update
[sudo] password for mtech: 
Hit:1 http://archive.ubuntu.com/ubuntu noble InRelease      
Get:2 http://archive.ubuntu.com/ubuntu noble-updates InRelease [126 kB]
Hit:3 http://archive.ubuntu.com/ubuntu noble-backports InRelease      
Get:4 http://archive.ubuntu.com/ubuntu noble-updates/main i386 Packages [514 kB]
Get:5 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 Packages [1,079 kB]
Get:6 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 Packages [1,659 kB]
Hit:7 http://security.ubuntu.com/ubuntu noble-security InRelease               
Fetched 3,378 kB in 5s (616 kB/s)
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
335 packages can be upgraded. Run 'apt list --upgradable' to see them.
mtech@programming-lab:~$ sudo apt install whois
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following packages were automatically installed and are no longer required:
  libgl1-amber-dri libglapi-mesa libllvm17t64 linux-hwe-6.14-tools-6.14.0-34
  linux-image-6.14.0-34-generic linux-modules-6.14.0-34-generic
  linux-modules-extra-6.14.0-34-generic linux-tools-6.14.0-34-generic
Use 'sudo apt autoremove' to remove them.
The following NEW packages will be installed:
  whois
0 upgraded, 1 newly installed, 0 to remove and 335 not upgraded.
4 not fully installed or removed.
Need to get 51.7 kB of archives.
After this operation, 279 kB of additional disk space will be used.
Get:1 http://archive.ubuntu.com/ubuntu noble/main amd64 whois amd64 5.5.22 [51.7 kB]
Fetched 51.7 kB in 0s (294 kB/s) 
Selecting previously unselected package whois.
(Reading database ... 299098 files and directories currently installed.)
Preparing to unpack .../whois_5.5.22_amd64.deb ...
Unpacking whois (5.5.22) ...
Setting up whois (5.5.22) ...
Setting up linux-headers-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
/etc/kernel/header_postinst.d/dkms:
 * dkms: running auto installation service for kernel 6.17.0-35-generic
Sign command: /usr/bin/kmodsign
Signing key: /var/lib/shim-signed/mok/MOK.priv
Public certificate (MOK): /var/lib/shim-signed/mok/MOK.der

Building module:
Cleaning build area...
make -j8 KERNELRELEASE=6.17.0-35-generic -C /lib/modules/6.17.0-35-generic/build
 M=/var/lib/dkms/virtualbox/7.0.16/build...(bad exit status: 2)
ERROR: Cannot create report: [Errno 17] File exists: '/var/crash/virtualbox-dkms
.0.crash'
Error! Bad return status for module build on kernel: 6.17.0-35-generic (x86_64)
Consult /var/lib/dkms/virtualbox/7.0.16/build/make.log for more information.
dkms autoinstall on 6.17.0-35-generic/x86_64 failed for virtualbox(10)
Error! One or more modules failed to install during autoinstall.
Refer to previous errors for more information.
 * dkms: autoinstall for kernel 6.17.0-35-generic
   ...fail!
run-parts: /etc/kernel/header_postinst.d/dkms exited with return code 11
dpkg: error processing package linux-headers-6.17.0-35-generic (--configure):
 installed linux-headers-6.17.0-35-generic package post-installation script subp
rocess returned error exit status 11
Setting up linux-image-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
dpkg: dependency problems prevent configuration of linux-headers-generic-hwe-24.
04:
 linux-headers-generic-hwe-24.04 depends on linux-headers-6.17.0-35-generic; how
ever:
  Package linux-headers-6.17.0-35-generic is not configured yet.

dpkg: error processing package linux-headers-generic-hwe-24.04 (--configure):
 dependency problems - leaving unconfigured
dpkg: dependency problems prevent configuration of linux-generic-hwe-24.04:
 linux-generic-hwe-24.04 depends on linux-headers-generic-hwe-24.04 (= 6.17.0-35
.35~24.04.1); however:
  Package linux-headers-generic-hwe-24.04 is not configured yet.

dpkg: error processing package linux-generic-hwe-24.04 (--configure):
 dependency problems - leaving unconfigured
No apport report written because the error message indicates its a followup erro
r from a previous failure.
                          No apport report written because the error message ind
icates its a followup error from a previous failure.
                                                    Processing triggers for man-
db (2.12.0-4build2) ...
Processing triggers for linux-image-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
/etc/kernel/postinst.d/dkms:
 * dkms: running auto installation service for kernel 6.17.0-35-generic
Sign command: /usr/bin/kmodsign
Signing key: /var/lib/shim-signed/mok/MOK.priv
Public certificate (MOK): /var/lib/shim-signed/mok/MOK.der

Building module:
Cleaning build area...
make -j8 KERNELRELEASE=6.17.0-35-generic -C /lib/modules/6.17.0-35-generic/build
 M=/var/lib/dkms/virtualbox/7.0.16/build...(bad exit status: 2)
ERROR: Cannot create report: [Errno 17] File exists: '/var/crash/virtualbox-dkms
.0.crash'
Error! Bad return status for module build on kernel: 6.17.0-35-generic (x86_64)
Consult /var/lib/dkms/virtualbox/7.0.16/build/make.log for more information.
dkms autoinstall on 6.17.0-35-generic/x86_64 failed for virtualbox(10)
Error! One or more modules failed to install during autoinstall.
Refer to previous errors for more information.
 * dkms: autoinstall for kernel 6.17.0-35-generic
   ...fail!
run-parts: /etc/kernel/postinst.d/dkms exited with return code 11
dpkg: error processing package linux-image-6.17.0-35-generic (--configure):
 installed linux-image-6.17.0-35-generic package post-installation script subpro
cess returned error exit status 11
No apport report written because MaxReports is reached already
                                                              Errors were encoun
tered while processing:
 linux-headers-6.17.0-35-generic
 linux-headers-generic-hwe-24.04
 linux-generic-hwe-24.04
 linux-image-6.17.0-35-generic
E: Sub-process /usr/bin/dpkg returned an error code (1)
mtech@programming-lab:~$ whois ayushrkumar.vercel.app
getaddrinfo(whois.nic.app): Name or service not known
mtech@programming-lab:~$ whois google.com
   Domain Name: GOOGLE.COM
   Registry Domain ID: 2138514_DOMAIN_COM-VRSN
   Registrar WHOIS Server: whois.markmonitor.com
   Registrar URL: http://www.markmonitor.com
   Updated Date: 2019-09-09T15:39:04Z
   Creation Date: 1997-09-15T04:00:00Z
   Registry Expiry Date: 2028-09-14T04:00:00Z
   Registrar: MarkMonitor Inc.
   Registrar IANA ID: 292
   Registrar Abuse Contact Email: abusecomplaints@markmonitor.com
   Registrar Abuse Contact Phone: +1.2086851750
   Domain Status: clientDeleteProhibited https://icann.org/epp#clientDeleteProhibited
   Domain Status: clientTransferProhibited https://icann.org/epp#clientTransferProhibited
   Domain Status: clientUpdateProhibited https://icann.org/epp#clientUpdateProhibited
   Domain Status: serverDeleteProhibited https://icann.org/epp#serverDeleteProhibited
   Domain Status: serverTransferProhibited https://icann.org/epp#serverTransferProhibited
   Domain Status: serverUpdateProhibited https://icann.org/epp#serverUpdateProhibited
   Name Server: NS1.GOOGLE.COM
   Name Server: NS2.GOOGLE.COM
   Name Server: NS3.GOOGLE.COM
   Name Server: NS4.GOOGLE.COM
   DNSSEC: unsigned
   URL of the ICANN Whois Inaccuracy Complaint Form: https://www.icann.org/wicf/
>>> Last update of whois database: 2026-07-08T08:54:06Z <<<

For more information on Whois status codes, please visit https://icann.org/epp

NOTICE: The expiration date displayed in this record is the date the
registrar's sponsorship of the domain name registration in the registry is
currently set to expire. This date does not necessarily reflect the expiration
date of the domain name registrant's agreement with the sponsoring
registrar.  Users may consult the sponsoring registrar's Whois database to
view the registrar's reported date of expiration for this registration.

TERMS OF USE: You are not authorized to access or query our Whois
database through the use of electronic processes that are high-volume and
automated except as reasonably necessary to register domain names or
modify existing registrations; the Data in VeriSign Global Registry
Services' ("VeriSign") Whois database is provided by VeriSign for
information purposes only, and to assist persons in obtaining information
about or related to a domain name registration record. VeriSign does not
guarantee its accuracy. By submitting a Whois query, you agree to abide
by the following terms of use: You agree that you may use this Data only
for lawful purposes and that under no circumstances will you use this Data
to: (1) allow, enable, or otherwise support the transmission of mass
unsolicited, commercial advertising or solicitations via e-mail, telephone,
or facsimile; or (2) enable high volume, automated, electronic processes
that apply to VeriSign (or its computer systems). The compilation,
repackaging, dissemination or other use of this Data is expressly
prohibited without the prior written consent of VeriSign. You agree not to
use electronic processes that are automated and high-volume to access or
query the Whois database except as reasonably necessary to register
domain names or modify existing registrations. VeriSign reserves the right
to restrict your access to the Whois database in its sole discretion to ensure
operational stability.  VeriSign may restrict or terminate your access to the
Whois database for failure to abide by these terms of use. VeriSign
reserves the right to modify these terms at any time.

The Registry database contains ONLY .COM, .NET, .EDU domains and
Registrars.
Domain Name: google.com
Registry Domain ID: 2138514_DOMAIN_COM-VRSN
Registrar WHOIS Server: whois.markmonitor.com
Registrar URL: http://www.markmonitor.com
Updated Date: 2024-08-02T02:17:33+0000
Creation Date: 1997-09-15T07:00:00+0000
Registrar Registration Expiration Date: 2028-09-13T07:00:00+0000
Registrar: MarkMonitor, Inc.
Registrar IANA ID: 292
Registrar Abuse Contact: https://corp.markmonitor.com/domain/ui/abuse-report
Registrar Abuse Contact Phone: +1.2086851750
Domain Status: clientUpdateProhibited (https://www.icann.org/epp#clientUpdateProhibited)
Domain Status: clientTransferProhibited (https://www.icann.org/epp#clientTransferProhibited)
Domain Status: clientDeleteProhibited (https://www.icann.org/epp#clientDeleteProhibited)
Domain Status: serverUpdateProhibited (https://www.icann.org/epp#serverUpdateProhibited)
Domain Status: serverTransferProhibited (https://www.icann.org/epp#serverTransferProhibited)
Domain Status: serverDeleteProhibited (https://www.icann.org/epp#serverDeleteProhibited)
Registrant Organization: Google LLC
Registrant Country: US
Registrant Email: Select Request Email Form at https://domains.markmonitor.com/whois/google.com
Tech Email: Select Request Email Form at https://domains.markmonitor.com/whois/google.com
Name Server: ns3.google.com
Name Server: ns2.google.com
Name Server: ns4.google.com
Name Server: ns1.google.com
DNSSEC: unsigned
URL of the ICANN WHOIS Data Problem Reporting System: http://wdprs.internic.net/
>>> Last update of WHOIS database: 2026-07-08T08:50:50+0000 <<<

For more information on WHOIS status codes, please visit:
  https://www.icann.org/resources/pages/epp-status-codes

If you wish to contact this domain’s Registrant or Technical
contact, and such email address is not visible above, you may do so via our web
form, pursuant to ICANN’s Temporary Specification. To verify that you are not a
robot, please enter your email address to receive a link to a page that
facilitates email communication with the relevant contact(s).

Web-based WHOIS:
  https://domains.markmonitor.com/whois/contact/google.com

If you have a legitimate interest in viewing the non-public WHOIS details, send
your request and the reasons for your request to whoisrequest@markmonitor.com
and specify the domain name in the subject line. We will review that request and
may ask for supporting documentation and explanation.

The data in MarkMonitor’s WHOIS database is provided for information purposes,
and to assist persons in obtaining information about or related to a domain
name’s registration record. While MarkMonitor believes the data to be accurate,
the data is provided "as is" with no guarantee or warranties regarding its
accuracy.

By submitting a WHOIS query, you agree that you will use this data only for
lawful purposes and that, under no circumstances will you use this data to:
  (1) allow, enable, or otherwise support the transmission by email, telephone,
or facsimile of mass, unsolicited, commercial advertising, or spam; or
  (2) enable high volume, automated, or electronic processes that send queries,
data, or email to MarkMonitor (or its systems) or the domain name contacts (or
its systems).

MarkMonitor reserves the right to modify these terms at any time.

By submitting this query, you agree to abide by this policy.

MarkMonitor Domain Management(TM)
Protecting companies and consumers in a digital world.

Visit MarkMonitor at https://www.markmonitor.com
Contact us at +1.8007459229
In Europe, at +44.02032062220
--
mtech@programming-lab:~$ whois arjyunk.vercel.app
getaddrinfo(whois.nic.app): Name or service not known
mtech@programming-lab:~$ whois ayushrkumar.vercel.app
getaddrinfo(whois.nic.app): Name or service not known
mtech@programming-lab:~$ whois google.com
   Domain Name: GOOGLE.COM
   Registry Domain ID: 2138514_DOMAIN_COM-VRSN
   Registrar WHOIS Server: whois.markmonitor.com
   Registrar URL: http://www.markmonitor.com
   Updated Date: 2019-09-09T15:39:04Z
   Creation Date: 1997-09-15T04:00:00Z
   Registry Expiry Date: 2028-09-14T04:00:00Z
   Registrar: MarkMonitor Inc.
   Registrar IANA ID: 292
   Registrar Abuse Contact Email: abusecomplaints@markmonitor.com
   Registrar Abuse Contact Phone: +1.2086851750
   Domain Status: clientDeleteProhibited https://icann.org/epp#clientDeleteProhibited
   Domain Status: clientTransferProhibited https://icann.org/epp#clientTransferProhibited
   Domain Status: clientUpdateProhibited https://icann.org/epp#clientUpdateProhibited
   Domain Status: serverDeleteProhibited https://icann.org/epp#serverDeleteProhibited
   Domain Status: serverTransferProhibited https://icann.org/epp#serverTransferProhibited
   Domain Status: serverUpdateProhibited https://icann.org/epp#serverUpdateProhibited
   Name Server: NS1.GOOGLE.COM
   Name Server: NS2.GOOGLE.COM
   Name Server: NS3.GOOGLE.COM
   Name Server: NS4.GOOGLE.COM
   DNSSEC: unsigned
   URL of the ICANN Whois Inaccuracy Complaint Form: https://www.icann.org/wicf/
>>> Last update of whois database: 2026-07-08T08:55:06Z <<<

For more information on Whois status codes, please visit https://icann.org/epp

NOTICE: The expiration date displayed in this record is the date the
registrar's sponsorship of the domain name registration in the registry is
currently set to expire. This date does not necessarily reflect the expiration
date of the domain name registrant's agreement with the sponsoring
registrar.  Users may consult the sponsoring registrar's Whois database to
view the registrar's reported date of expiration for this registration.

TERMS OF USE: You are not authorized to access or query our Whois
database through the use of electronic processes that are high-volume and
automated except as reasonably necessary to register domain names or
modify existing registrations; the Data in VeriSign Global Registry
Services' ("VeriSign") Whois database is provided by VeriSign for
information purposes only, and to assist persons in obtaining information
about or related to a domain name registration record. VeriSign does not
guarantee its accuracy. By submitting a Whois query, you agree to abide
by the following terms of use: You agree that you may use this Data only
for lawful purposes and that under no circumstances will you use this Data
to: (1) allow, enable, or otherwise support the transmission of mass
unsolicited, commercial advertising or solicitations via e-mail, telephone,
or facsimile; or (2) enable high volume, automated, electronic processes
that apply to VeriSign (or its computer systems). The compilation,
repackaging, dissemination or other use of this Data is expressly
prohibited without the prior written consent of VeriSign. You agree not to
use electronic processes that are automated and high-volume to access or
query the Whois database except as reasonably necessary to register
domain names or modify existing registrations. VeriSign reserves the right
to restrict your access to the Whois database in its sole discretion to ensure
operational stability.  VeriSign may restrict or terminate your access to the
Whois database for failure to abide by these terms of use. VeriSign
reserves the right to modify these terms at any time.

The Registry database contains ONLY .COM, .NET, .EDU domains and
Registrars.
Domain Name: google.com
Registry Domain ID: 2138514_DOMAIN_COM-VRSN
Registrar WHOIS Server: whois.markmonitor.com
Registrar URL: http://www.markmonitor.com
Updated Date: 2024-08-02T02:17:33+0000
Creation Date: 1997-09-15T07:00:00+0000
Registrar Registration Expiration Date: 2028-09-13T07:00:00+0000
Registrar: MarkMonitor, Inc.
Registrar IANA ID: 292
Registrar Abuse Contact: https://corp.markmonitor.com/domain/ui/abuse-report
Registrar Abuse Contact Phone: +1.2086851750
Domain Status: clientUpdateProhibited (https://www.icann.org/epp#clientUpdateProhibited)
Domain Status: clientTransferProhibited (https://www.icann.org/epp#clientTransferProhibited)
Domain Status: clientDeleteProhibited (https://www.icann.org/epp#clientDeleteProhibited)
Domain Status: serverUpdateProhibited (https://www.icann.org/epp#serverUpdateProhibited)
Domain Status: serverTransferProhibited (https://www.icann.org/epp#serverTransferProhibited)
Domain Status: serverDeleteProhibited (https://www.icann.org/epp#serverDeleteProhibited)
Registrant Organization: Google LLC
Registrant Country: US
Registrant Email: Select Request Email Form at https://domains.markmonitor.com/whois/google.com
Tech Email: Select Request Email Form at https://domains.markmonitor.com/whois/google.com
Name Server: ns3.google.com
Name Server: ns2.google.com
Name Server: ns4.google.com
Name Server: ns1.google.com
DNSSEC: unsigned
URL of the ICANN WHOIS Data Problem Reporting System: http://wdprs.internic.net/
>>> Last update of WHOIS database: 2026-07-08T08:50:50+0000 <<<

For more information on WHOIS status codes, please visit:
  https://www.icann.org/resources/pages/epp-status-codes

If you wish to contact this domain’s Registrant or Technical
contact, and such email address is not visible above, you may do so via our web
form, pursuant to ICANN’s Temporary Specification. To verify that you are not a
robot, please enter your email address to receive a link to a page that
facilitates email communication with the relevant contact(s).

Web-based WHOIS:
  https://domains.markmonitor.com/whois/contact/google.com

If you have a legitimate interest in viewing the non-public WHOIS details, send
your request and the reasons for your request to whoisrequest@markmonitor.com
and specify the domain name in the subject line. We will review that request and
may ask for supporting documentation and explanation.

The data in MarkMonitor’s WHOIS database is provided for information purposes,
and to assist persons in obtaining information about or related to a domain
name’s registration record. While MarkMonitor believes the data to be accurate,
the data is provided "as is" with no guarantee or warranties regarding its
accuracy.

By submitting a WHOIS query, you agree that you will use this data only for
lawful purposes and that, under no circumstances will you use this data to:
  (1) allow, enable, or otherwise support the transmission by email, telephone,
or facsimile of mass, unsolicited, commercial advertising, or spam; or
  (2) enable high volume, automated, or electronic processes that send queries,
data, or email to MarkMonitor (or its systems) or the domain name contacts (or
its systems).

MarkMonitor reserves the right to modify these terms at any time.

By submitting this query, you agree to abide by this policy.

MarkMonitor Domain Management(TM)
Protecting companies and consumers in a digital world.

Visit MarkMonitor at https://www.markmonitor.com
Contact us at +1.8007459229
In Europe, at +44.02032062220
--
mtech@programming-lab:~$ whois nssce.ac.in
getaddrinfo(whois.registry.in): Name or service not known
mtech@programming-lab:~$ nslookup ayushrkumar.vercel.app
Server:		127.0.0.53
Address:	127.0.0.53#53

Non-authoritative answer:
Name:	ayushrkumar.vercel.app
Address: 64.29.17.3
Name:	ayushrkumar.vercel.app
Address: 216.198.79.3

mtech@programming-lab:~$ whois 127.0.0.53#53
No whois server is known for this kind of object.
mtech@programming-lab:~$ whois 64.29.17.3

^CInterrupted by signal 2...
mtech@programming-lab:~$ whois 64.29.17.3

#
# ARIN WHOIS data and services are subject to the Terms of Use
# available at: https://www.arin.net/resources/registry/whois/tou/
#
# If you see inaccuracies in the results, please report at
# https://www.arin.net/resources/registry/whois/inaccuracy_reporting/
#
# Copyright 1997-2026, American Registry for Internet Numbers, Ltd.
#


NetRange:       64.29.17.0 - 64.29.17.255
CIDR:           64.29.17.0/24
NetName:        VERCEL-12
NetHandle:      NET-64-29-17-0-1
Parent:         NET64 (NET-64-0-0-0-0)
NetType:        Direct Allocation
OriginAS:       
Organization:   Vercel, Inc (ZEITI)
RegDate:        2024-07-24
Updated:        2024-09-06
Comment:        -----BEGIN CERTIFICATE-----MIIDcTCCAlmgAwIBAgIUG3fLMg4lmUoGrZeoRP3pyeyPxxUwDQYJKoZIhvcNAQELBQAwSDELMAkGA1UEBhMCVVMxCzAJBgNVBAgMAkNBMQ8wDQYDVQQKDAZWZXJjZWwxGzAZBgkqhkiG9w0BCQEWDG1AdmVyY2VsLmNvbTAeFw0yNDA5MDYyMDQ4NTZaFw0yNTA5MDYyMDQ4NTZaMEgxCzAJBgNVBAYTAlVTMQswCQYDVQQIDAJDQTEPMA0GA1UECgwGVmVyY2VsMRswGQYJKoZIhvcNAQkBFgxtQHZlcmNlbC5jb20wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCgx/+3yp84ItBB01htl1gcoUhaKidV7vk12wH47FQuaISJ0suUEdTLwbrrwFt1GMWXqWoE140S8thx9CVJIkXQVjgkXW31YGjA0SqeFMD7qN6zbMGhxCNrrab+qk9OFZixXCUCu5vEMiqBa4mVX/zulfxjiuJ/7VGFAsCuJcpPcHiR7xPxEtcut26Us41u6v0QkBrnqks7P5KBa+l92KdHiGb5B/KLdzXud+7KBrMPmKzUmpVfNa89PZypHkQcotym2QcqgTOV845jHmfpU9k+Mt891VtDlAbZDY+nnALCFJA8itZ6gv8Xo5lVh7RQYfQDB1snpgKxweYxg+3VjdHjAgMBAAGjUzBRMB0GA1UdDgQWBBQbOsBzsO63c12HItE63nCPKpU8rjAfBgNVHSMEGDAWgBQbOsBzsO63c12HItE63nCPKpU8rjAPBgNVHRMBAf8EBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IBAQB3QlgP7uZPJ3k1ZsxXEoPE5wpPNw+gsDKODgKHXd9ra54o7yMx1pkoq1MVIWwOyE7A2nJt3yN5YePlblxWrrzBFaNC0oAC/JSHNJRADSAf3lfIKxyvz+sRp09jRa1Ge3jXVC9qU5oVqSxhcX/kgTYzbA5Ifi7mLQueS6y5LOTrcarQ034PjG0NNqJmZ8LdTJ93BS9vKxpiCzv1r7NvQTS1H6zsc5GapYF3F21bRFt4i5xvnTGWlZ8p/60yW5hQcDkNmzXGF6KG6xUw71vH3b2Wq8bp67eIPRDudUV2PE1zx9kb+2K/h+++nvWc6yDjh3b0z4aa9lXEAWrAzrbmWrCF-----END CERTIFICATE-----
Ref:            https://rdap.arin.net/registry/ip/64.29.17.0


OrgName:        Vercel, Inc
OrgId:          ZEITI
Address:        340 S LEMON AVE #4133
City:           Walnut
StateProv:      CA
PostalCode:     91789
Country:        US
RegDate:        2020-03-26
Updated:        2026-03-18
Comment:        https://vercel.com
Ref:            https://rdap.arin.net/registry/entity/ZEITI


OrgTechHandle: HADDA65-ARIN
OrgTechName:   Haddad, Joe 
OrgTechPhone:  +1-415-398-5463 
OrgTechEmail:  timer@vercel.com
OrgTechRef:    https://rdap.arin.net/registry/entity/HADDA65-ARIN

OrgAbuseHandle: ABUSE7926-ARIN
OrgAbuseName:   Abuse 
OrgAbusePhone:  +1-415-980-8007 
OrgAbuseEmail:  abuse@vercel.com
OrgAbuseRef:    https://rdap.arin.net/registry/entity/ABUSE7926-ARIN

OrgTechHandle: MFV2-ARIN
OrgTechName:   Vieira, Matheus Fernandez
OrgTechPhone:  +1-415-980-8007 
OrgTechEmail:  arin@vercel.com
OrgTechRef:    https://rdap.arin.net/registry/entity/MFV2-ARIN


#
# ARIN WHOIS data and services are subject to the Terms of Use
# available at: https://www.arin.net/resources/registry/whois/tou/
#
# If you see inaccuracies in the results, please report at
# https://www.arin.net/resources/registry/whois/inaccuracy_reporting/
#
# Copyright 1997-2026, American Registry for Internet Numbers, Ltd.
#

mtech@programming-lab:~$ whois 216.198.79.3

#
# ARIN WHOIS data and services are subject to the Terms of Use
# available at: https://www.arin.net/resources/registry/whois/tou/
#
# If you see inaccuracies in the results, please report at
# https://www.arin.net/resources/registry/whois/inaccuracy_reporting/
#
# Copyright 1997-2026, American Registry for Internet Numbers, Ltd.
#


NetRange:       216.198.79.0 - 216.198.79.255
CIDR:           216.198.79.0/24
NetName:        VERCEL-05
NetHandle:      NET-216-198-79-0-1
Parent:         NET216 (NET-216-0-0-0-0)
NetType:        Direct Allocation
OriginAS:       
Organization:   Vercel, Inc (ZEITI)
RegDate:        2024-07-18
Updated:        2024-07-23
Comment:        -----BEGIN CERTIFICATE-----MIIDmzCCAoOgAwIBAgIUTMKcM2H1tsIcV3hpF0N39LVAKWIwDQYJKoZIhvcNAQELBQAwXTELMAkGA1UEBhMCVVMxCzAJBgNVBAgMAkNBMQ8wDQYDVQQHDAZDb3ZpbmExEzARBgNVBAoMClZlcmNlbCBJbmMxGzAZBgkqhkiG9w0BCQEWDG1AdmVyY2VsLmNvbTAeFw0yNDA3MjMxODA5MzVaFw0yNTA3MjMxODA5MzVaMF0xCzAJBgNVBAYTAlVTMQswCQYDVQQIDAJDQTEPMA0GA1UEBwwGQ292aW5hMRMwEQYDVQQKDApWZXJjZWwgSW5jMRswGQYJKoZIhvcNAQkBFgxtQHZlcmNlbC5jb20wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC+/hHwf0sOo4vzyuP6s+JuoHeErI6mJcPNhQCCxAxYNDTaDeEXd3LixVwQRaNWbwr7W3n178dI1ONH48DbC1vhhKPlsr+PlMxg5Zq084ImbtwjU6u7xx1Gy0ImcZL7ZV2BAstBp5E4YuiLVl4n5eS9IsnicnfXtcqOrAbdMAtzS8IxVRzekxHRfUQ4yVeKSTP+U68h97eNSYDm/KFzuHJ5vX8jWFaeEySyc/ailkkvEkf6iVJ792XyaTEBjdBkwA+0h5xFn8p+b/BOhEnIQFlGvjZz4XK+fuO93sVlnhPl7GeBOnnzKk4XdvoYD0GJtmyWN11//GJl7Napc9B5va2FAgMBAAGjUzBRMB0GA1UdDgQWBBT/9wzVcRhqga1CZzs9uB+5Mgpe2DAfBgNVHSMEGDAWgBT/9wzVcRhqga1CZzs9uB+5Mgpe2DAPBgNVHRMBAf8EBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IBAQBMtW8dZu5ILejM0uSRuuOIQdhOT7Uedc3AzcDmEQrtJ4WPN4wbPmRLiRNFEpgMEeoICKKmQId1Cw2nMpuvscmie7J5gm6K82iWNQqNUDOIKt4B6G2tMcf6rLWDwTHsBtR/w5CrtoaoAIop+8WNYgESJBgbEqnArRMhBdTvhuZShmT0zCO5n12Ed0kNql+fNJyYR91Z/+VzZ7yC8Kj1dYaqZlwuDjbHe1a72UzyIN/vTQuWCGQFiGw+7zScO04nNF+L3YYRKyQTNhWRJTvD7GOXYJk1aNz730p0h8ic/4RnlF0SljxXNtBvjT2iTBQoePVx4cMpqdtvcaivCq1Q6Odh-----END CERTIFICATE-----
Ref:            https://rdap.arin.net/registry/ip/216.198.79.0



OrgName:        Vercel, Inc
OrgId:          ZEITI
Address:        340 S LEMON AVE #4133
City:           Walnut
StateProv:      CA
PostalCode:     91789
Country:        US
RegDate:        2020-03-26
Updated:        2026-03-18
Comment:        https://vercel.com
Ref:            https://rdap.arin.net/registry/entity/ZEITI


OrgTechHandle: HADDA65-ARIN
OrgTechName:   Haddad, Joe 
OrgTechPhone:  +1-415-398-5463 
OrgTechEmail:  timer@vercel.com
OrgTechRef:    https://rdap.arin.net/registry/entity/HADDA65-ARIN

OrgAbuseHandle: ABUSE7926-ARIN
OrgAbuseName:   Abuse 
OrgAbusePhone:  +1-415-980-8007 
OrgAbuseEmail:  abuse@vercel.com
OrgAbuseRef:    https://rdap.arin.net/registry/entity/ABUSE7926-ARIN

OrgTechHandle: MFV2-ARIN
OrgTechName:   Vieira, Matheus Fernandez
OrgTechPhone:  +1-415-980-8007 
OrgTechEmail:  arin@vercel.com
OrgTechRef:    https://rdap.arin.net/registry/entity/MFV2-ARIN


#
# ARIN WHOIS data and services are subject to the Terms of Use
# available at: https://www.arin.net/resources/registry/whois/tou/
#
# If you see inaccuracies in the results, please report at
# https://www.arin.net/resources/registry/whois/inaccuracy_reporting/
#
# Copyright 1997-2026, American Registry for Internet Numbers, Ltd.
#

mtech@programming-lab:~$ nslookup nssce.ac.in
Server:		127.0.0.53
Address:	127.0.0.53#53

Non-authoritative answer:
Name:	nssce.ac.in
Address: 199.250.200.43

mtech@programming-lab:~$ whois 199.250.200.43

#
# ARIN WHOIS data and services are subject to the Terms of Use
# available at: https://www.arin.net/resources/registry/whois/tou/
#
# If you see inaccuracies in the results, please report at
# https://www.arin.net/resources/registry/whois/inaccuracy_reporting/
#
# Copyright 1997-2026, American Registry for Internet Numbers, Ltd.
#


NetRange:       199.250.192.0 - 199.250.223.255
CIDR:           199.250.192.0/19
NetName:        INMOT-1
NetHandle:      NET-199-250-192-0-1
Parent:         NET199 (NET-199-0-0-0-0)
NetType:        Direct Allocation
OriginAS:       
Organization:   InMotion Hosting, Inc. (INMOT-1)
RegDate:        2018-02-01
Updated:        2018-02-01
Ref:            https://rdap.arin.net/registry/ip/199.250.192.0


OrgName:        InMotion Hosting, Inc.
OrgId:          INMOT-1
Address:        2 Constitution Drive
Address:        Suite 101
City:           Virginia Beach
StateProv:      VA
PostalCode:     23462
Country:        US
RegDate:        2008-06-03
Updated:        2025-09-25
Ref:            https://rdap.arin.net/registry/entity/INMOT-1


OrgTechHandle: NETWO9334-ARIN
OrgTechName:   Network Operations
OrgTechPhone:  +1-757-693-5293 
OrgTechEmail:  noc@inmotionhosting.com
OrgTechRef:    https://rdap.arin.net/registry/entity/NETWO9334-ARIN

OrgAbuseHandle: SYSTE299-ARIN
OrgAbuseName:   Systems Team
OrgAbusePhone:  +1-888-321-4678 
OrgAbuseEmail:  abuse@inmotionhosting.com
OrgAbuseRef:    https://rdap.arin.net/registry/entity/SYSTE299-ARIN


#
# ARIN WHOIS data and services are subject to the Terms of Use
# available at: https://www.arin.net/resources/registry/whois/tou/
#
# If you see inaccuracies in the results, please report at
# https://www.arin.net/resources/registry/whois/inaccuracy_reporting/
#
# Copyright 1997-2026, American Registry for Internet Numbers, Ltd.
#

mtech@programming-lab:~$ sudo apt install nmap -y
[sudo] password for mtech: 
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following packages were automatically installed and are no longer required:
  libgl1-amber-dri libglapi-mesa libllvm17t64 linux-hwe-6.14-tools-6.14.0-34 linux-image-6.14.0-34-generic linux-modules-6.14.0-34-generic
  linux-modules-extra-6.14.0-34-generic linux-tools-6.14.0-34-generic
Use 'sudo apt autoremove' to remove them.
The following additional packages will be installed:
  libblas3 liblinear4 libssh2-1t64 nmap-common
Suggested packages:
  liblinear-tools liblinear-dev ncat ndiff zenmap
The following NEW packages will be installed:
  libblas3 liblinear4 libssh2-1t64 nmap nmap-common
0 upgraded, 5 newly installed, 0 to remove and 335 not upgraded.
4 not fully installed or removed.
Need to get 6,287 kB of archives.
After this operation, 27.4 MB of additional disk space will be used.
Get:1 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libblas3 amd64 3.12.0-3build1.1 [238 kB]
Get:2 http://archive.ubuntu.com/ubuntu noble/universe amd64 liblinear4 amd64 2.3.0+dfsg-5build1 [42.3 kB]
Get:3 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libssh2-1t64 amd64 1.11.0-4.1ubuntu0.24.04.2 [120 kB]
Get:4 http://archive.ubuntu.com/ubuntu noble/universe amd64 nmap-common all 7.94+git20230807.3be01efb1+dfsg-3build2 [4,192 kB]
Get:5 http://archive.ubuntu.com/ubuntu noble/universe amd64 nmap amd64 7.94+git20230807.3be01efb1+dfsg-3build2 [1,694 kB]
Fetched 6,287 kB in 6s (1,043 kB/s)                                                                                                                    
Selecting previously unselected package libblas3:amd64.
(Reading database ... 299109 files and directories currently installed.)
Preparing to unpack .../libblas3_3.12.0-3build1.1_amd64.deb ...
Unpacking libblas3:amd64 (3.12.0-3build1.1) ...
Selecting previously unselected package liblinear4:amd64.
Preparing to unpack .../liblinear4_2.3.0+dfsg-5build1_amd64.deb ...
Unpacking liblinear4:amd64 (2.3.0+dfsg-5build1) ...
Selecting previously unselected package libssh2-1t64:amd64.
Preparing to unpack .../libssh2-1t64_1.11.0-4.1ubuntu0.24.04.2_amd64.deb ...
Unpacking libssh2-1t64:amd64 (1.11.0-4.1ubuntu0.24.04.2) ...
Selecting previously unselected package nmap-common.
Preparing to unpack .../nmap-common_7.94+git20230807.3be01efb1+dfsg-3build2_all.deb ...
Unpacking nmap-common (7.94+git20230807.3be01efb1+dfsg-3build2) ...
Selecting previously unselected package nmap.
Preparing to unpack .../nmap_7.94+git20230807.3be01efb1+dfsg-3build2_amd64.deb ...
Unpacking nmap (7.94+git20230807.3be01efb1+dfsg-3build2) ...
Setting up linux-headers-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
/etc/kernel/header_postinst.d/dkms:
 * dkms: running auto installation service for kernel 6.17.0-35-generic
Sign command: /usr/bin/kmodsign
Signing key: /var/lib/shim-signed/mok/MOK.priv
Public certificate (MOK): /var/lib/shim-signed/mok/MOK.der

Building module:
Cleaning build area...
make -j8 KERNELRELEASE=6.17.0-35-generic -C /lib/modules/6.17.0-35-generic/build M=/var/lib/dkms/virtualbox/7.0.16/build...(bad exit status: 2)
ERROR: Cannot create report: [Errno 17] File exists: '/var/crash/virtualbox-dkms.0.crash'
Error! Bad return status for module build on kernel: 6.17.0-35-generic (x86_64)
Consult /var/lib/dkms/virtualbox/7.0.16/build/make.log for more information.
dkms autoinstall on 6.17.0-35-generic/x86_64 failed for virtualbox(10)
Error! One or more modules failed to install during autoinstall.
Refer to previous errors for more information.
 * dkms: autoinstall for kernel 6.17.0-35-generic
   ...fail!
run-parts: /etc/kernel/header_postinst.d/dkms exited with return code 11
dpkg: error processing package linux-headers-6.17.0-35-generic (--configure):
 installed linux-headers-6.17.0-35-generic package post-installation script subprocess returned error exit status 11
Setting up libblas3:amd64 (3.12.0-3build1.1) ...
update-alternatives: using /usr/lib/x86_64-linux-gnu/blas/libblas.so.3 to provide /usr/lib/x86_64-linux-gnu/libblas.so.3 (libblas.so.3-x86_64-linux-gnu)
 in auto mode
Setting up linux-image-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
Setting up nmap-common (7.94+git20230807.3be01efb1+dfsg-3build2) ...
dpkg: dependency problems prevent configuration of linux-headers-generic-hwe-24.04:
 linux-headers-generic-hwe-24.04 depends on linux-headers-6.17.0-35-generic; however:
  Package linux-headers-6.17.0-35-generic is not configured yet.

dpkg: error processing package linux-headers-generic-hwe-24.04 (--configure):
 dependency problems - leaving unconfigured
Setting up libssh2-1t64:amd64 (1.11.0-4.1ubuntu0.24.04.2) ...
No apport report written because the error message indicates its a followup error from a previous failure.
                                                                                                          Setting up liblinear4:amd64 (2.3.0+dfsg-5build
1) ...
dpkg: dependency problems prevent configuration of linux-generic-hwe-24.04:
 linux-generic-hwe-24.04 depends on linux-headers-generic-hwe-24.04 (= 6.17.0-35.35~24.04.1); however:
  Package linux-headers-generic-hwe-24.04 is not configured yet.

dpkg: error processing package linux-generic-hwe-24.04 (--configure):
 dependency problems - leaving unconfigured
Setting up nmap (7.94+git20230807.3be01efb1+dfsg-3build2) ...
No apport report written because the error message indicates its a followup error from a previous failure.
                                                                                                          Processing triggers for man-db (2.12.0-4build2
) ...
Processing triggers for libc-bin (2.39-0ubuntu8.7) ...
Processing triggers for linux-image-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
/etc/kernel/postinst.d/dkms:
 * dkms: running auto installation service for kernel 6.17.0-35-generic
Sign command: /usr/bin/kmodsign
Signing key: /var/lib/shim-signed/mok/MOK.priv
Public certificate (MOK): /var/lib/shim-signed/mok/MOK.der

Building module:
Cleaning build area...
make -j8 KERNELRELEASE=6.17.0-35-generic -C /lib/modules/6.17.0-35-generic/build M=/var/lib/dkms/virtualbox/7.0.16/build...(bad exit status: 2)
ERROR: Cannot create report: [Errno 17] File exists: '/var/crash/virtualbox-dkms.0.crash'
Error! Bad return status for module build on kernel: 6.17.0-35-generic (x86_64)
Consult /var/lib/dkms/virtualbox/7.0.16/build/make.log for more information.
dkms autoinstall on 6.17.0-35-generic/x86_64 failed for virtualbox(10)
Error! One or more modules failed to install during autoinstall.
Refer to previous errors for more information.
 * dkms: autoinstall for kernel 6.17.0-35-generic
   ...fail!
run-parts: /etc/kernel/postinst.d/dkms exited with return code 11
dpkg: error processing package linux-image-6.17.0-35-generic (--configure):
 installed linux-image-6.17.0-35-generic package post-installation script subprocess returned error exit status 11
No apport report written because MaxReports is reached already
                                                              Errors were encountered while processing:
 linux-headers-6.17.0-35-generic
 linux-headers-generic-hwe-24.04
 linux-generic-hwe-24.04
 linux-image-6.17.0-35-generic
E: Sub-process /usr/bin/dpkg returned an error code (1)
mtech@programming-lab:~$ ip a
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host noprefixroute 
       valid_lft forever preferred_lft forever
2: enp1s0: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc pfifo_fast state UP group default qlen 1000
    link/ether d0:ad:08:55:ae:1c brd ff:ff:ff:ff:ff:ff
    inet 10.10.1.54/16 brd 10.10.255.255 scope global dynamic noprefixroute enp1s0
       valid_lft 25941sec preferred_lft 25941sec
    inet6 fe80::b27e:1e1e:30ab:f580/64 scope link noprefixroute 
       valid_lft forever preferred_lft forever
mtech@programming-lab:~$ sudo nmap -A 10.10.1.85
Starting Nmap 7.94SVN ( https://nmap.org ) at 2026-07-08 14:51 IST
Nmap scan report for 10.10.1.85
Host is up (0.000091s latency).
All 1000 scanned ports on 10.10.1.85 are in ignored states.
Not shown: 1000 closed tcp ports (reset)
MAC Address: D0:AD:08:55:8D:35 (Unknown)
Too many fingerprints match this host to give specific OS details
Network Distance: 1 hop

TRACEROUTE
HOP RTT     ADDRESS
1   0.09 ms 10.10.1.85

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 2.00 seconds
mtech@programming-lab:~$ nmap -A 10.10.1.85
Starting Nmap 7.94SVN ( https://nmap.org ) at 2026-07-08 14:51 IST
Nmap scan report for 10.10.1.85
Host is up (0.000072s latency).
All 1000 scanned ports on 10.10.1.85 are in ignored states.
Not shown: 1000 closed tcp ports (conn-refused)

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 0.34 seconds
mtech@programming-lab:~$ nmap -A 10.10.1.85
Starting Nmap 7.94SVN ( https://nmap.org ) at 2026-07-08 14:54 IST
Nmap scan report for 10.10.1.85
Host is up (0.000079s latency).
All 1000 scanned ports on 10.10.1.85 are in ignored states.
Not shown: 1000 closed tcp ports (conn-refused)

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 0.20 seconds
mtech@programming-lab:~$ nmap -A 10.10.1.85
Starting Nmap 7.94SVN ( https://nmap.org ) at 2026-07-08 14:57 IST
Nmap scan report for 10.10.1.85
Host is up (0.000094s latency).
All 1000 scanned ports on 10.10.1.85 are in ignored states.
Not shown: 1000 closed tcp ports (conn-refused)

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 0.17 seconds
mtech@programming-lab:~$ man nmap
mtech@programming-lab:~$ sudo nmap -sI 10.10.1.85
WARNING: Many people use -Pn w/Idlescan to prevent pings from their true IP.  On the other hand, timing info Nmap gains from pings can allow for faster, more reliable scans.
Starting Nmap 7.94SVN ( https://nmap.org ) at 2026-07-08 15:02 IST
WARNING: No targets were specified, so 0 hosts scanned.
Nmap done: 0 IP addresses (0 hosts up) scanned in 2.01 seconds
mtech@programming-lab:~$ man nmap
mtech@programming-lab:~$ man nmap
mtech@programming-lab:~$ sudo apt tcpdump
E: Invalid operation tcpdump
mtech@programming-lab:~$ sudo apt install tcpdump
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following packages were automatically installed and are no longer required:
  libgl1-amber-dri libglapi-mesa libllvm17t64 linux-hwe-6.14-tools-6.14.0-34 linux-image-6.14.0-34-generic linux-modules-6.14.0-34-generic
  linux-modules-extra-6.14.0-34-generic linux-tools-6.14.0-34-generic
Use 'sudo apt autoremove' to remove them.
The following packages will be upgraded:
  tcpdump
1 upgraded, 0 newly installed, 0 to remove and 334 not upgraded.
4 not fully installed or removed.
Need to get 479 kB of archives.
After this operation, 0 B of additional disk space will be used.
Get:1 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 tcpdump amd64 4.99.4-3ubuntu4.24.04.1 [479 kB]
Fetched 479 kB in 0s (1,536 kB/s)
(Reading database ... 299980 files and directories currently installed.)
Preparing to unpack .../tcpdump_4.99.4-3ubuntu4.24.04.1_amd64.deb ...
Unpacking tcpdump (4.99.4-3ubuntu4.24.04.1) over (4.99.4-3ubuntu4) ...
Setting up tcpdump (4.99.4-3ubuntu4.24.04.1) ...
Setting up linux-headers-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
/etc/kernel/header_postinst.d/dkms:
 * dkms: running auto installation service for kernel 6.17.0-35-generic
Sign command: /usr/bin/kmodsign
Signing key: /var/lib/shim-signed/mok/MOK.priv
Public certificate (MOK): /var/lib/shim-signed/mok/MOK.der

Building module:
Cleaning build area...
make -j8 KERNELRELEASE=6.17.0-35-generic -C /lib/modules/6.17.0-35-generic/build M=/var/lib/dkms/virtualbox/7.0.16/build...(bad exit status: 2)
ERROR: Cannot create report: [Errno 17] File exists: '/var/crash/virtualbox-dkms.0.crash'
Error! Bad return status for module build on kernel: 6.17.0-35-generic (x86_64)
Consult /var/lib/dkms/virtualbox/7.0.16/build/make.log for more information.
dkms autoinstall on 6.17.0-35-generic/x86_64 failed for virtualbox(10)
Error! One or more modules failed to install during autoinstall.
Refer to previous errors for more information.
 * dkms: autoinstall for kernel 6.17.0-35-generic
   ...fail!
run-parts: /etc/kernel/header_postinst.d/dkms exited with return code 11
dpkg: error processing package linux-headers-6.17.0-35-generic (--configure):
 installed linux-headers-6.17.0-35-generic package post-installation script subprocess returned error exit status 11
Setting up linux-image-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
dpkg: dependency problems prevent configuration of linux-headers-generic-hwe-24.04:
 linux-headers-generic-hwe-24.04 depends on linux-headers-6.17.0-35-generic; however:
  Package linux-headers-6.17.0-35-generic is not configured yet.

dpkg: error processing package linux-headers-generic-hwe-24.04 (--configure):
 dependency problems - leaving unconfigured
dpkg: dependency problems prevent configuration of linux-generic-hwe-24.04:
 linux-generic-hwe-24.04 depends on linux-headers-generic-hwe-24.04 (= 6.17.0-35.35~24.04.1); however:
  Package linux-headers-generic-hwe-24.04 is not configured yet.

dpkg: error processing package linux-generic-hwe-24.04 (--configure):
 dependency problems - leaving unconfigured
No apport report written because the error message indicates its a followup error from a previous failure.
                                                                                                          No apport report written because the error mes
sage indicates its a followup error from a previous failure.
                                                            Processing triggers for man-db (2.12.0-4build2) ...
Processing triggers for linux-image-6.17.0-35-generic (6.17.0-35.35~24.04.1) ...
/etc/kernel/postinst.d/dkms:
 * dkms: running auto installation service for kernel 6.17.0-35-generic
Sign command: /usr/bin/kmodsign
Signing key: /var/lib/shim-signed/mok/MOK.priv
Public certificate (MOK): /var/lib/shim-signed/mok/MOK.der

Building module:
Cleaning build area...
make -j8 KERNELRELEASE=6.17.0-35-generic -C /lib/modules/6.17.0-35-generic/build M=/var/lib/dkms/virtualbox/7.0.16/build...(bad exit status: 2)
ERROR: Cannot create report: [Errno 17] File exists: '/var/crash/virtualbox-dkms.0.crash'
Error! Bad return status for module build on kernel: 6.17.0-35-generic (x86_64)
Consult /var/lib/dkms/virtualbox/7.0.16/build/make.log for more information.
dkms autoinstall on 6.17.0-35-generic/x86_64 failed for virtualbox(10)
Error! One or more modules failed to install during autoinstall.
Refer to previous errors for more information.
 * dkms: autoinstall for kernel 6.17.0-35-generic
   ...fail!
run-parts: /etc/kernel/postinst.d/dkms exited with return code 11
dpkg: error processing package linux-image-6.17.0-35-generic (--configure):
 installed linux-image-6.17.0-35-generic package post-installation script subprocess returned error exit status 11
No apport report written because MaxReports is reached already
                                                              Errors were encountered while processing:
 linux-headers-6.17.0-35-generic
 linux-headers-generic-hwe-24.04
 linux-generic-hwe-24.04
 linux-image-6.17.0-35-generic
E: Sub-process /usr/bin/dpkg returned an error code (1)
mtech@programming-lab:~$ tcpdump
tcpdump: enp1s0: You don't have permission to perform this capture on that device
(socket: Operation not permitted)
mtech@programming-lab:~$ sudo tcpdump
tcpdump: verbose output suppressed, use -v[v]... for full protocol decode
listening on enp1s0, link-type EN10MB (Ethernet), snapshot length 262144 bytes
15:12:24.498558 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:12:24.607746 ARP, Request who-has 10.10.49.216 tell 10.10.1.69, length 46
15:12:24.607762 ARP, Request who-has 10.10.50.216 tell 10.10.1.69, length 46
15:12:24.607763 ARP, Request who-has 10.10.61.216 tell 10.10.1.69, length 46
15:12:24.607765 ARP, Request who-has 10.10.62.216 tell 10.10.1.69, length 46
15:12:24.607767 ARP, Request who-has 10.10.63.216 tell 10.10.1.69, length 46
15:12:24.607768 ARP, Request who-has 10.10.48.217 tell 10.10.1.69, length 46
15:12:24.607770 ARP, Request who-has 10.10.59.217 tell 10.10.1.69, length 46
15:12:24.607771 ARP, Request who-has 10.10.60.217 tell 10.10.1.69, length 46
15:12:24.607781 ARP, Request who-has 10.10.61.217 tell 10.10.1.69, length 46
15:12:24.607783 ARP, Request who-has 10.10.62.217 tell 10.10.1.69, length 46
15:12:24.672743 IP programming-lab.37856 > b.resolvers.level3.net.domain: 16023+ [1au] PTR? 216.49.10.10.in-addr.arpa. (54)
15:12:24.755870 IP b.resolvers.level3.net.domain > programming-lab.37856: 16023 NXDomain* 0/1/1 (113)
15:12:24.756320 IP programming-lab.54632 > b.resolvers.level3.net.domain: 16235+ [1au] PTR? 69.1.10.10.in-addr.arpa. (52)
15:12:24.807976 ARP, Request who-has 10.10.55.219 tell 10.10.1.69, length 46
15:12:24.807991 ARP, Request who-has 10.10.56.219 tell 10.10.1.69, length 46
15:12:24.807993 ARP, Request who-has 10.10.57.219 tell 10.10.1.69, length 46
15:12:24.807995 ARP, Request who-has 10.10.58.219 tell 10.10.1.69, length 46
15:12:24.807996 ARP, Request who-has 10.10.53.220 tell 10.10.1.69, length 46
15:12:24.807998 ARP, Request who-has 10.10.54.220 tell 10.10.1.69, length 46
15:12:24.807999 ARP, Request who-has 10.10.55.220 tell 10.10.1.69, length 46
15:12:24.808001 ARP, Request who-has 10.10.56.220 tell 10.10.1.69, length 46
15:12:24.808017 ARP, Request who-has 10.10.51.221 tell 10.10.1.69, length 46
15:12:24.808019 ARP, Request who-has 10.10.52.221 tell 10.10.1.69, length 46
15:12:24.844943 IP b.resolvers.level3.net.domain > programming-lab.54632: 16235 NXDomain* 0/1/1 (111)
15:12:24.845416 IP programming-lab.58751 > b.resolvers.level3.net.domain: 43575+ [1au] PTR? 216.50.10.10.in-addr.arpa. (54)
15:12:24.904336 IP 10.10.1.124 > igmp.mcast.net: igmp v3 report, 1 group record(s)
15:12:24.941729 IP b.resolvers.level3.net.domain > programming-lab.58751: 43575 NXDomain* 0/1/1 (113)
15:12:24.942186 IP programming-lab.59372 > b.resolvers.level3.net.domain: 30770+ [1au] PTR? 216.61.10.10.in-addr.arpa. (54)
15:12:25.008798 ARP, Request who-has 10.10.55.219 tell 10.10.1.69, length 46
15:12:25.008814 ARP, Request who-has 10.10.56.219 tell 10.10.1.69, length 46
15:12:25.008816 ARP, Request who-has 10.10.57.219 tell 10.10.1.69, length 46
15:12:25.008817 ARP, Request who-has 10.10.58.219 tell 10.10.1.69, length 46
15:12:25.008819 ARP, Request who-has 10.10.53.220 tell 10.10.1.69, length 46
15:12:25.008821 ARP, Request who-has 10.10.54.220 tell 10.10.1.69, length 46
15:12:25.008822 ARP, Request who-has 10.10.55.220 tell 10.10.1.69, length 46
15:12:25.008824 ARP, Request who-has 10.10.56.220 tell 10.10.1.69, length 46
15:12:25.008841 ARP, Request who-has 10.10.51.221 tell 10.10.1.69, length 46
15:12:25.008842 ARP, Request who-has 10.10.52.221 tell 10.10.1.69, length 46
15:12:25.010823 IP b.resolvers.level3.net.domain > programming-lab.59372: 30770 NXDomain* 0/1/1 (113)
15:12:25.011252 IP programming-lab.56970 > b.resolvers.level3.net.domain: 16491+ [1au] PTR? 216.62.10.10.in-addr.arpa. (54)
15:12:25.070922 IP b.resolvers.level3.net.domain > programming-lab.56970: 16491 NXDomain* 0/1/1 (113)
15:12:25.071377 IP programming-lab.50449 > b.resolvers.level3.net.domain: 45573+ [1au] PTR? 216.63.10.10.in-addr.arpa. (54)
15:12:25.127956 IP b.resolvers.level3.net.domain > programming-lab.50449: 45573 NXDomain* 0/1/1 (113)
15:12:25.128412 IP programming-lab.38218 > b.resolvers.level3.net.domain: 22068+ [1au] PTR? 217.48.10.10.in-addr.arpa. (54)
15:12:25.171452 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:12:25.209336 ARP, Request who-has 10.10.51.222 tell 10.10.1.69, length 46
15:12:25.209351 ARP, Request who-has 10.10.52.222 tell 10.10.1.69, length 46
15:12:25.209353 ARP, Request who-has 10.10.63.222 tell 10.10.1.69, length 46
15:12:25.209355 ARP, Request who-has 10.10.48.223 tell 10.10.1.69, length 46
15:12:25.209357 ARP, Request who-has 10.10.49.223 tell 10.10.1.69, length 46
15:12:25.209358 ARP, Request who-has 10.10.50.223 tell 10.10.1.69, length 46
15:12:25.209360 ARP, Request who-has 10.10.61.223 tell 10.10.1.69, length 46
15:12:25.209361 ARP, Request who-has 10.10.62.223 tell 10.10.1.69, length 46
15:12:25.209378 ARP, Request who-has 10.10.63.223 tell 10.10.1.69, length 46
15:12:25.209380 ARP, Request who-has 10.10.48.224 tell 10.10.1.69, length 46
15:12:25.377301 IP 10.10.1.124 > igmp.mcast.net: igmp v3 report, 1 group record(s)
15:12:30.284972 IP programming-lab.53458 > dns.google.domain: 51636+ [1au] PTR? 2.2.2.4.in-addr.arpa. (49)
15:12:30.287946 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:12:30.303989 IP dns.google.domain > programming-lab.53458: 51636 1/0/1 PTR b.resolvers.level3.net. (85)
15:12:30.304311 IP programming-lab.41681 > dns.google.domain: 52993+ [1au] PTR? 54.1.10.10.in-addr.arpa. (52)
15:12:30.326361 IP dns.google.domain > programming-lab.41681: 52993 NXDomain 0/0/1 (52)
15:12:30.326641 IP programming-lab.59412 > dns.google.domain: 1936+ [1au] PTR? 219.55.10.10.in-addr.arpa. (54)
15:12:30.369319 IP dns.google.domain > programming-lab.59412: 1936 NXDomain 0/0/1 (54)
15:12:30.369778 IP programming-lab.39093 > dns.google.domain: 18879+ [1au] PTR? 219.56.10.10.in-addr.arpa. (54)
15:12:30.421853 ARP, Request who-has 10.10.57.22 tell 10.10.1.69, length 46
15:12:30.421869 ARP, Request who-has 10.10.58.22 tell 10.10.1.69, length 46
15:12:30.421870 ARP, Request who-has 10.10.59.22 tell 10.10.1.69, length 46
15:12:30.421872 ARP, Request who-has 10.10.60.22 tell 10.10.1.69, length 46
15:12:30.421874 ARP, Request who-has 10.10.53.25 tell 10.10.1.69, length 46
15:12:30.421875 ARP, Request who-has 10.10.54.25 tell 10.10.1.69, length 46
15:12:30.421877 ARP, Request who-has 10.10.49.26 tell 10.10.1.69, length 46
15:12:30.421878 ARP, Request who-has 10.10.50.26 tell 10.10.1.69, length 46
15:12:30.421895 ARP, Request who-has 10.10.59.28 tell 10.10.1.69, length 46
15:12:30.421897 ARP, Request who-has 10.10.60.28 tell 10.10.1.69, length 46
15:12:30.444758 IP 10.10.1.120.53760 > 255.255.255.255.29810: UDP, length 367
15:12:35.928747 IP programming-lab.47693 > b.resolvers.level3.net.domain: 17583+ [1au] PTR? 22.0.0.224.in-addr.arpa. (52)
15:12:36.001098 IP b.resolvers.level3.net.domain > programming-lab.47693: 17583 1/0/1 PTR igmp.mcast.net. (80)
15:12:36.001556 IP programming-lab.44390 > b.resolvers.level3.net.domain: 32832+ [1au] PTR? 124.1.10.10.in-addr.arpa. (53)
15:12:36.120074 IP programming-lab.44372 > b.resolvers.level3.net.domain: 51379+ [1au] PTR? 5.1.10.10.in-addr.arpa. (51)
15:12:36.189533 IP b.resolvers.level3.net.domain > programming-lab.44372: 51379 NXDomain* 0/1/1 (110)
15:12:36.189944 IP programming-lab.46146 > b.resolvers.level3.net.domain: 63881+ [1au] PTR? 2.1.10.10.in-addr.arpa. (51)
15:12:36.234419 ARP, Request who-has 10.10.53.172 tell 10.10.1.69, length 46
15:12:36.234432 ARP, Request who-has 10.10.54.172 tell 10.10.1.69, length 46
15:12:36.234434 ARP, Request who-has 10.10.49.173 tell 10.10.1.69, length 46
15:12:36.234435 ARP, Request who-has 10.10.50.173 tell 10.10.1.69, length 46
15:12:36.234435 ARP, Request who-has 10.10.59.175 tell 10.10.1.69, length 46
15:12:36.234435 ARP, Request who-has 10.10.60.175 tell 10.10.1.69, length 46
15:12:36.234436 ARP, Request who-has 10.10.61.175 tell 10.10.1.69, length 46
15:12:36.234436 ARP, Request who-has 10.10.62.175 tell 10.10.1.69, length 46
15:12:36.234440 ARP, Request who-has 10.10.55.178 tell 10.10.1.69, length 46
15:12:36.234441 ARP, Request who-has 10.10.56.178 tell 10.10.1.69, length 46
15:12:36.246593 IP b.resolvers.level3.net.domain > programming-lab.46146: 63881 NXDomain* 0/1/1 (110)
15:12:36.247029 IP programming-lab.39433 > b.resolvers.level3.net.domain: 51318+ [1au] PTR? 222.51.10.10.in-addr.arpa. (54)
15:12:36.252588 IP 10.10.1.119.41549 > 255.255.255.255.29810: UDP, length 367
15:12:36.306317 IP b.resolvers.level3.net.domain > programming-lab.39433: 51318 NXDomain* 0/1/1 (113)
15:12:36.306787 IP programming-lab.42059 > b.resolvers.level3.net.domain: 7431+ [1au] PTR? 222.52.10.10.in-addr.arpa. (54)
15:12:36.366027 IP b.resolvers.level3.net.domain > programming-lab.42059: 7431 NXDomain* 0/1/1 (113)
15:12:36.366578 IP programming-lab.57718 > b.resolvers.level3.net.domain: 37011+ [1au] PTR? 222.63.10.10.in-addr.arpa. (54)
15:12:36.380937 IP 10.10.1.124 > igmp.mcast.net: igmp v3 report, 1 group record(s)
15:12:36.411575 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:12:36.430118 IP b.resolvers.level3.net.domain > programming-lab.57718: 37011 NXDomain* 0/1/1 (113)
15:12:36.430643 IP programming-lab.55542 > b.resolvers.level3.net.domain: 56800+ [1au] PTR? 223.48.10.10.in-addr.arpa. (54)
15:12:46.839049 IP programming-lab.52885 > b.resolvers.level3.net.domain: 8288+ [1au] PTR? 8.8.8.8.in-addr.arpa. (49)
15:12:46.895267 IP b.resolvers.level3.net.domain > programming-lab.52885: 8288 1/0/1 PTR dns.google. (73)
15:12:46.895776 IP programming-lab.43520 > b.resolvers.level3.net.domain: 43557+ [1au] PTR? 22.57.10.10.in-addr.arpa. (53)
15:12:46.934975 IP 10.10.1.124 > igmp.mcast.net: igmp v3 report, 1 group record(s)
15:12:46.948284 IP b.resolvers.level3.net.domain > programming-lab.43520: 43557 NXDomain* 0/1/1 (112)
15:12:46.948741 IP programming-lab.47804 > b.resolvers.level3.net.domain: 60053+ [1au] PTR? 22.58.10.10.in-addr.arpa. (53)
15:12:46.949673 ARP, Request who-has 10.10.79.7 tell 10.10.1.69, length 46
15:12:46.949680 ARP, Request who-has 10.10.64.8 tell 10.10.1.69, length 46
15:12:46.949682 ARP, Request who-has 10.10.65.8 tell 10.10.1.69, length 46
15:12:46.949684 ARP, Request who-has 10.10.66.8 tell 10.10.1.69, length 46
15:12:46.949686 ARP, Request who-has 10.10.67.8 tell 10.10.1.69, length 46
15:12:46.949687 ARP, Request who-has 10.10.68.8 tell 10.10.1.69, length 46
15:12:46.949689 ARP, Request who-has 10.10.69.8 tell 10.10.1.69, length 46
15:12:46.949728 ARP, Request who-has 10.10.70.8 tell 10.10.1.69, length 46
15:12:46.949728 ARP, Request who-has 10.10.71.8 tell 10.10.1.69, length 46
15:12:46.949729 ARP, Request who-has 10.10.72.8 tell 10.10.1.69, length 46
15:12:47.042447 IP b.resolvers.level3.net.domain > programming-lab.47804: 60053 NXDomain* 0/1/1 (112)
15:12:47.042971 IP programming-lab.50265 > b.resolvers.level3.net.domain: 39013+ [1au] PTR? 22.59.10.10.in-addr.arpa. (53)
15:12:47.136872 IP b.resolvers.level3.net.domain > programming-lab.50265: 39013 NXDomain* 0/1/1 (112)
15:12:47.137525 IP programming-lab.49974 > b.resolvers.level3.net.domain: 34668+ [1au] PTR? 22.60.10.10.in-addr.arpa. (53)
15:12:47.151169 ARP, Request who-has 10.10.79.7 tell 10.10.1.69, length 46
15:12:47.151185 ARP, Request who-has 10.10.64.8 tell 10.10.1.69, length 46
15:12:47.151186 ARP, Request who-has 10.10.65.8 tell 10.10.1.69, length 46
15:12:47.151188 ARP, Request who-has 10.10.66.8 tell 10.10.1.69, length 46
15:12:47.151190 ARP, Request who-has 10.10.67.8 tell 10.10.1.69, length 46
15:12:47.151191 ARP, Request who-has 10.10.68.8 tell 10.10.1.69, length 46
15:12:47.151193 ARP, Request who-has 10.10.69.8 tell 10.10.1.69, length 46
15:12:47.151194 ARP, Request who-has 10.10.70.8 tell 10.10.1.69, length 46
15:12:47.151212 ARP, Request who-has 10.10.71.8 tell 10.10.1.69, length 46
15:12:47.151214 ARP, Request who-has 10.10.72.8 tell 10.10.1.69, length 46
15:12:47.971884 IP programming-lab.55404 > b.resolvers.level3.net.domain: 13670+ [1au] PTR? 172.53.10.10.in-addr.arpa. (54)
15:12:48.083211 IP b.resolvers.level3.net.domain > programming-lab.55404: 13670 NXDomain* 0/1/1 (113)
15:12:48.083855 IP programming-lab.60353 > b.resolvers.level3.net.domain: 14638+ [1au] PTR? 172.54.10.10.in-addr.arpa. (54)
15:12:48.156625 ARP, Request who-has 10.10.73.10 tell 10.10.1.69, length 46
15:12:48.156642 ARP, Request who-has 10.10.74.10 tell 10.10.1.69, length 46
15:12:48.156642 ARP, Request who-has 10.10.75.10 tell 10.10.1.69, length 46
15:12:48.156642 ARP, Request who-has 10.10.76.10 tell 10.10.1.69, length 46
15:12:48.156642 ARP, Request who-has 10.10.77.10 tell 10.10.1.69, length 46
15:12:48.156643 ARP, Request who-has 10.10.78.10 tell 10.10.1.69, length 46
15:12:48.156643 ARP, Request who-has 10.10.79.10 tell 10.10.1.69, length 46
15:12:48.156643 ARP, Request who-has 10.10.64.11 tell 10.10.1.69, length 46
15:12:48.156648 ARP, Request who-has 10.10.65.11 tell 10.10.1.69, length 46
15:12:48.156648 ARP, Request who-has 10.10.66.11 tell 10.10.1.69, length 46
15:12:48.162398 IP b.resolvers.level3.net.domain > programming-lab.60353: 14638 NXDomain* 0/1/1 (113)
15:12:48.162926 IP programming-lab.47898 > b.resolvers.level3.net.domain: 36896+ [1au] PTR? 173.49.10.10.in-addr.arpa. (54)
15:12:48.298648 IP b.resolvers.level3.net.domain > programming-lab.47898: 36896 NXDomain* 0/1/1 (113)
15:12:48.299194 IP programming-lab.54129 > b.resolvers.level3.net.domain: 57358+ [1au] PTR? 173.50.10.10.in-addr.arpa. (54)
15:12:48.358151 ARP, Request who-has 10.10.73.10 tell 10.10.1.69, length 46
15:12:48.358167 ARP, Request who-has 10.10.74.10 tell 10.10.1.69, length 46
15:12:48.358168 ARP, Request who-has 10.10.75.10 tell 10.10.1.69, length 46
15:12:48.358170 ARP, Request who-has 10.10.76.10 tell 10.10.1.69, length 46
15:12:48.358172 ARP, Request who-has 10.10.77.10 tell 10.10.1.69, length 46
15:12:48.358173 ARP, Request who-has 10.10.78.10 tell 10.10.1.69, length 46
15:12:48.358175 ARP, Request who-has 10.10.79.10 tell 10.10.1.69, length 46
15:12:48.358177 ARP, Request who-has 10.10.64.11 tell 10.10.1.69, length 46
15:12:48.358197 ARP, Request who-has 10.10.65.11 tell 10.10.1.69, length 46
15:12:48.358199 ARP, Request who-has 10.10.66.11 tell 10.10.1.69, length 46
15:12:48.886127 IP programming-lab.40952 > b.resolvers.level3.net.domain: 31217+ [1au] PTR? 7.79.10.10.in-addr.arpa. (52)
15:12:48.961530 ARP, Request who-has 10.10.69.12 tell 10.10.1.69, length 46
15:12:48.961546 ARP, Request who-has 10.10.70.12 tell 10.10.1.69, length 46
15:12:48.961548 ARP, Request who-has 10.10.71.12 tell 10.10.1.69, length 46
15:12:48.961549 ARP, Request who-has 10.10.72.12 tell 10.10.1.69, length 46
15:12:48.961551 ARP, Request who-has 10.10.73.12 tell 10.10.1.69, length 46
15:12:48.961552 ARP, Request who-has 10.10.74.12 tell 10.10.1.69, length 46
15:12:48.961554 ARP, Request who-has 10.10.75.12 tell 10.10.1.69, length 46
15:12:48.961555 ARP, Request who-has 10.10.76.12 tell 10.10.1.69, length 46
15:12:48.961575 ARP, Request who-has 10.10.77.12 tell 10.10.1.69, length 46
15:12:48.961577 ARP, Request who-has 10.10.78.12 tell 10.10.1.69, length 46
15:12:48.978308 IP b.resolvers.level3.net.domain > programming-lab.40952: 31217 NXDomain* 0/1/1 (111)
15:12:48.978870 IP programming-lab.44448 > b.resolvers.level3.net.domain: 7932+ [1au] PTR? 8.64.10.10.in-addr.arpa. (52)
15:12:49.079387 IP b.resolvers.level3.net.domain > programming-lab.44448: 7932 NXDomain* 0/1/1 (111)
15:12:49.079938 IP programming-lab.58649 > b.resolvers.level3.net.domain: 47302+ [1au] PTR? 8.65.10.10.in-addr.arpa. (52)
15:12:49.162632 ARP, Request who-has 10.10.69.12 tell 10.10.1.69, length 46
15:12:49.162648 ARP, Request who-has 10.10.70.12 tell 10.10.1.69, length 46
15:12:49.162650 ARP, Request who-has 10.10.71.12 tell 10.10.1.69, length 46
15:12:49.162652 ARP, Request who-has 10.10.72.12 tell 10.10.1.69, length 46
15:12:49.162653 ARP, Request who-has 10.10.73.12 tell 10.10.1.69, length 46
15:12:49.162655 ARP, Request who-has 10.10.74.12 tell 10.10.1.69, length 46
15:12:49.162656 ARP, Request who-has 10.10.75.12 tell 10.10.1.69, length 46
15:12:49.162658 ARP, Request who-has 10.10.76.12 tell 10.10.1.69, length 46
15:12:49.162675 ARP, Request who-has 10.10.77.12 tell 10.10.1.69, length 46
15:12:49.162677 ARP, Request who-has 10.10.78.12 tell 10.10.1.69, length 46
15:12:49.174081 IP b.resolvers.level3.net.domain > programming-lab.58649: 47302 NXDomain* 0/1/1 (111)
15:12:49.174716 IP programming-lab.46968 > b.resolvers.level3.net.domain: 1040+ [1au] PTR? 8.66.10.10.in-addr.arpa. (52)
15:12:49.810884 IP programming-lab.36553 > b.resolvers.level3.net.domain: 29151+ [1au] PTR? 10.73.10.10.in-addr.arpa. (53)
15:12:49.919266 IP b.resolvers.level3.net.domain > programming-lab.36553: 29151 NXDomain* 0/1/1 (112)
15:12:49.919825 IP programming-lab.54871 > b.resolvers.level3.net.domain: 26076+ [1au] PTR? 10.74.10.10.in-addr.arpa. (53)
15:12:49.966831 ARP, Request who-has 10.10.65.14 tell 10.10.1.69, length 46
15:12:49.966845 ARP, Request who-has 10.10.66.14 tell 10.10.1.69, length 46
15:12:49.966847 ARP, Request who-has 10.10.67.14 tell 10.10.1.69, length 46
15:12:49.966848 ARP, Request who-has 10.10.68.14 tell 10.10.1.69, length 46
15:12:49.966850 ARP, Request who-has 10.10.69.14 tell 10.10.1.69, length 46
15:12:49.966852 ARP, Request who-has 10.10.70.14 tell 10.10.1.69, length 46
15:12:49.966853 ARP, Request who-has 10.10.71.14 tell 10.10.1.69, length 46
15:12:49.966855 ARP, Request who-has 10.10.72.14 tell 10.10.1.69, length 46
15:12:49.966870 ARP, Request who-has 10.10.73.14 tell 10.10.1.69, length 46
15:12:49.966872 ARP, Request who-has 10.10.74.14 tell 10.10.1.69, length 46
15:12:50.019739 IP b.resolvers.level3.net.domain > programming-lab.54871: 26076 NXDomain* 0/1/1 (112)
15:12:50.020309 IP programming-lab.42777 > b.resolvers.level3.net.domain: 42505+ [1au] PTR? 10.75.10.10.in-addr.arpa. (53)
15:12:50.089242 IP b.resolvers.level3.net.domain > programming-lab.42777: 42505 NXDomain* 0/1/1 (112)
15:12:50.089689 IP programming-lab.52038 > b.resolvers.level3.net.domain: 7533+ [1au] PTR? 10.76.10.10.in-addr.arpa. (53)
15:13:00.566557 IP programming-lab.55721 > b.resolvers.level3.net.domain: 42525+ [1au] PTR? 12.69.10.10.in-addr.arpa. (53)
15:13:00.627358 ARP, Request who-has 10.10.75.37 tell 10.10.1.69, length 46
15:13:00.627373 ARP, Request who-has 10.10.76.37 tell 10.10.1.69, length 46
15:13:00.627375 ARP, Request who-has 10.10.77.37 tell 10.10.1.69, length 46
15:13:00.627376 ARP, Request who-has 10.10.78.37 tell 10.10.1.69, length 46
15:13:00.627378 ARP, Request who-has 10.10.79.37 tell 10.10.1.69, length 46
15:13:00.627380 ARP, Request who-has 10.10.64.38 tell 10.10.1.69, length 46
15:13:00.627381 ARP, Request who-has 10.10.65.38 tell 10.10.1.69, length 46
15:13:00.627383 ARP, Request who-has 10.10.66.38 tell 10.10.1.69, length 46
15:13:00.627400 ARP, Request who-has 10.10.67.38 tell 10.10.1.69, length 46
15:13:00.627402 ARP, Request who-has 10.10.68.38 tell 10.10.1.69, length 46
15:13:00.674696 IP b.resolvers.level3.net.domain > programming-lab.55721: 42525 NXDomain* 0/1/1 (112)
15:13:00.675018 IP programming-lab.36439 > b.resolvers.level3.net.domain: 60656+ [1au] PTR? 12.70.10.10.in-addr.arpa. (53)
15:13:00.685079 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:13:00.727288 IP b.resolvers.level3.net.domain > programming-lab.36439: 60656 NXDomain* 0/1/1 (112)
15:13:00.727709 IP programming-lab.47129 > b.resolvers.level3.net.domain: 52137+ [1au] PTR? 12.71.10.10.in-addr.arpa. (53)
15:13:01.453422 IP programming-lab.37993 > b.resolvers.level3.net.domain: 42806+ [1au] PTR? 14.65.10.10.in-addr.arpa. (53)
15:13:01.524366 IP b.resolvers.level3.net.domain > programming-lab.37993: 42806 NXDomain* 0/1/1 (112)
15:13:01.524799 IP programming-lab.52503 > b.resolvers.level3.net.domain: 33574+ [1au] PTR? 14.66.10.10.in-addr.arpa. (53)
15:13:01.606767 IP b.resolvers.level3.net.domain > programming-lab.52503: 33574 NXDomain* 0/1/1 (112)
15:13:01.607227 IP programming-lab.54044 > b.resolvers.level3.net.domain: 5042+ [1au] PTR? 14.67.10.10.in-addr.arpa. (53)
15:13:01.632022 ARP, Request who-has 10.10.71.39 tell 10.10.1.69, length 46
15:13:01.632037 ARP, Request who-has 10.10.72.39 tell 10.10.1.69, length 46
15:13:01.632039 ARP, Request who-has 10.10.73.39 tell 10.10.1.69, length 46
15:13:01.632041 ARP, Request who-has 10.10.74.39 tell 10.10.1.69, length 46
15:13:01.632043 ARP, Request who-has 10.10.75.39 tell 10.10.1.69, length 46
15:13:01.632044 ARP, Request who-has 10.10.76.39 tell 10.10.1.69, length 46
15:13:01.632046 ARP, Request who-has 10.10.77.39 tell 10.10.1.69, length 46
15:13:01.632047 ARP, Request who-has 10.10.78.39 tell 10.10.1.69, length 46
15:13:01.632062 ARP, Request who-has 10.10.79.39 tell 10.10.1.69, length 46
15:13:01.632064 ARP, Request who-has 10.10.64.40 tell 10.10.1.69, length 46
15:13:01.688745 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:13:01.745253 IP b.resolvers.level3.net.domain > programming-lab.54044: 5042 NXDomain* 0/1/1 (112)
15:13:01.745809 IP programming-lab.39936 > b.resolvers.level3.net.domain: 50606+ [1au] PTR? 14.68.10.10.in-addr.arpa. (53)
15:13:01.833391 ARP, Request who-has 10.10.69.40 tell 10.10.1.69, length 46
15:13:01.833407 ARP, Request who-has 10.10.70.40 tell 10.10.1.69, length 46
15:13:01.833408 ARP, Request who-has 10.10.71.40 tell 10.10.1.69, length 46
15:13:01.833410 ARP, Request who-has 10.10.72.40 tell 10.10.1.69, length 46
15:13:01.833412 ARP, Request who-has 10.10.73.40 tell 10.10.1.69, length 46
15:13:01.833414 ARP, Request who-has 10.10.74.40 tell 10.10.1.69, length 46
15:13:01.833415 ARP, Request who-has 10.10.75.40 tell 10.10.1.69, length 46
15:13:01.833417 ARP, Request who-has 10.10.76.40 tell 10.10.1.69, length 46
15:13:01.833434 ARP, Request who-has 10.10.77.40 tell 10.10.1.69, length 46
15:13:01.833436 ARP, Request who-has 10.10.78.40 tell 10.10.1.69, length 46
15:13:01.837889 IP b.resolvers.level3.net.domain > programming-lab.39936: 50606 NXDomain* 0/1/1 (112)
15:13:01.838473 IP programming-lab.54227 > b.resolvers.level3.net.domain: 17902+ [1au] PTR? 14.69.10.10.in-addr.arpa. (53)
15:13:02.321105 IP programming-lab.40804 > b.resolvers.level3.net.domain: 24630+ [1au] PTR? 37.75.10.10.in-addr.arpa. (53)
15:13:02.436545 ARP, Request who-has 10.10.67.41 tell 10.10.1.69, length 46
15:13:02.436561 ARP, Request who-has 10.10.68.41 tell 10.10.1.69, length 46
15:13:02.436563 ARP, Request who-has 10.10.69.41 tell 10.10.1.69, length 46
15:13:02.436564 ARP, Request who-has 10.10.70.41 tell 10.10.1.69, length 46
15:13:02.436566 ARP, Request who-has 10.10.71.41 tell 10.10.1.69, length 46
15:13:02.436567 ARP, Request who-has 10.10.72.41 tell 10.10.1.69, length 46
15:13:02.436569 ARP, Request who-has 10.10.73.41 tell 10.10.1.69, length 46
15:13:02.436571 ARP, Request who-has 10.10.74.41 tell 10.10.1.69, length 46
15:13:02.436605 ARP, Request who-has 10.10.75.41 tell 10.10.1.69, length 46
15:13:02.436605 ARP, Request who-has 10.10.76.41 tell 10.10.1.69, length 46
15:13:02.439383 IP b.resolvers.level3.net.domain > programming-lab.40804: 24630 NXDomain* 0/1/1 (112)
15:13:02.439827 IP programming-lab.58361 > b.resolvers.level3.net.domain: 37152+ [1au] PTR? 37.76.10.10.in-addr.arpa. (53)
15:13:02.499013 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:13:02.521592 IP b.resolvers.level3.net.domain > programming-lab.58361: 37152 NXDomain* 0/1/1 (112)
15:13:02.522063 IP programming-lab.34919 > b.resolvers.level3.net.domain: 19158+ [1au] PTR? 37.77.10.10.in-addr.arpa. (53)
15:13:03.329653 IP programming-lab.57940 > b.resolvers.level3.net.domain: 30184+ [1au] PTR? 39.71.10.10.in-addr.arpa. (53)
15:13:03.391089 IP b.resolvers.level3.net.domain > programming-lab.57940: 30184 NXDomain* 0/1/1 (112)
15:13:03.391571 IP programming-lab.38471 > b.resolvers.level3.net.domain: 30102+ [1au] PTR? 39.72.10.10.in-addr.arpa. (53)
15:13:03.442255 ARP, Request who-has 10.10.77.43 tell 10.10.1.69, length 46
15:13:03.442270 ARP, Request who-has 10.10.78.43 tell 10.10.1.69, length 46
15:13:03.442272 ARP, Request who-has 10.10.79.43 tell 10.10.1.69, length 46
15:13:03.442273 ARP, Request who-has 10.10.64.44 tell 10.10.1.69, length 46
15:13:03.442275 ARP, Request who-has 10.10.65.44 tell 10.10.1.69, length 46
15:13:03.442276 ARP, Request who-has 10.10.66.44 tell 10.10.1.69, length 46
15:13:03.442278 ARP, Request who-has 10.10.67.44 tell 10.10.1.69, length 46
15:13:03.442280 ARP, Request who-has 10.10.68.44 tell 10.10.1.69, length 46
15:13:03.442310 ARP, Request who-has 10.10.69.44 tell 10.10.1.69, length 46
15:13:03.442311 ARP, Request who-has 10.10.70.44 tell 10.10.1.69, length 46
15:13:03.446209 IP b.resolvers.level3.net.domain > programming-lab.38471: 30102 NXDomain* 0/1/1 (112)
15:13:03.446671 IP programming-lab.43645 > b.resolvers.level3.net.domain: 22609+ [1au] PTR? 39.73.10.10.in-addr.arpa. (53)
15:13:03.539384 IP b.resolvers.level3.net.domain > programming-lab.43645: 22609 NXDomain* 0/1/1 (112)
15:13:03.539855 IP programming-lab.40289 > b.resolvers.level3.net.domain: 64629+ [1au] PTR? 39.74.10.10.in-addr.arpa. (53)
15:13:03.599788 IP b.resolvers.level3.net.domain > programming-lab.40289: 64629 NXDomain* 0/1/1 (112)
15:13:03.600264 IP programming-lab.50301 > b.resolvers.level3.net.domain: 59405+ [1au] PTR? 39.75.10.10.in-addr.arpa. (53)
15:13:03.640370 ARP, Request who-has 10.10.1.99 tell 10.10.1.122, length 46
15:13:03.640385 ARP, Request who-has 10.10.1.62 tell 10.10.1.122, length 46
15:13:04.101384 IP programming-lab.41508 > b.resolvers.level3.net.domain: 32596+ [1au] PTR? 40.69.10.10.in-addr.arpa. (53)
15:13:04.163401 IP b.resolvers.level3.net.domain > programming-lab.41508: 32596 NXDomain* 0/1/1 (112)
15:13:04.163873 IP programming-lab.49039 > b.resolvers.level3.net.domain: 50594+ [1au] PTR? 40.70.10.10.in-addr.arpa. (53)
15:13:04.219215 IP b.resolvers.level3.net.domain > programming-lab.49039: 50594 NXDomain* 0/1/1 (112)
15:13:04.219657 IP programming-lab.41161 > b.resolvers.level3.net.domain: 48806+ [1au] PTR? 40.71.10.10.in-addr.arpa. (53)
15:13:04.246244 ARP, Request who-has 10.10.73.45 tell 10.10.1.69, length 46
15:13:04.246259 ARP, Request who-has 10.10.74.45 tell 10.10.1.69, length 46
15:13:04.246261 ARP, Request who-has 10.10.75.45 tell 10.10.1.69, length 46
15:13:04.246263 ARP, Request who-has 10.10.76.45 tell 10.10.1.69, length 46
15:13:04.246264 ARP, Request who-has 10.10.77.45 tell 10.10.1.69, length 46
15:13:04.246266 ARP, Request who-has 10.10.78.45 tell 10.10.1.69, length 46
15:13:04.246268 ARP, Request who-has 10.10.79.45 tell 10.10.1.69, length 46
15:13:04.246318 ARP, Request who-has 10.10.64.46 tell 10.10.1.69, length 46
15:13:04.246318 ARP, Request who-has 10.10.65.46 tell 10.10.1.69, length 46
15:13:04.246319 ARP, Request who-has 10.10.66.46 tell 10.10.1.69, length 46
15:13:04.305443 IP b.resolvers.level3.net.domain > programming-lab.41161: 48806 NXDomain* 0/1/1 (112)
15:13:04.305917 IP programming-lab.43857 > b.resolvers.level3.net.domain: 45975+ [1au] PTR? 40.72.10.10.in-addr.arpa. (53)
15:13:04.900465 IP programming-lab.46438 > b.resolvers.level3.net.domain: 9819+ [1au] PTR? 41.67.10.10.in-addr.arpa. (53)
15:13:04.953356 IP b.resolvers.level3.net.domain > programming-lab.46438: 9819 NXDomain* 0/1/1 (112)
15:13:04.953840 IP programming-lab.57289 > b.resolvers.level3.net.domain: 22693+ [1au] PTR? 41.68.10.10.in-addr.arpa. (53)
15:13:05.010412 IP b.resolvers.level3.net.domain > programming-lab.57289: 22693 NXDomain* 0/1/1 (112)
15:13:05.010891 IP programming-lab.52638 > b.resolvers.level3.net.domain: 25897+ [1au] PTR? 41.69.10.10.in-addr.arpa. (53)
15:13:05.051101 ARP, Request who-has 10.10.69.47 tell 10.10.1.69, length 46
15:13:05.051117 ARP, Request who-has 10.10.70.47 tell 10.10.1.69, length 46
15:13:05.051119 ARP, Request who-has 10.10.71.47 tell 10.10.1.69, length 46
15:13:05.051120 ARP, Request who-has 10.10.72.47 tell 10.10.1.69, length 46
15:13:05.051122 ARP, Request who-has 10.10.73.47 tell 10.10.1.69, length 46
15:13:05.051123 ARP, Request who-has 10.10.74.47 tell 10.10.1.69, length 46
15:13:05.051125 ARP, Request who-has 10.10.75.47 tell 10.10.1.69, length 46
15:13:05.051126 ARP, Request who-has 10.10.76.47 tell 10.10.1.69, length 46
15:13:05.051163 ARP, Request who-has 10.10.77.47 tell 10.10.1.69, length 46
15:13:05.051164 ARP, Request who-has 10.10.78.47 tell 10.10.1.69, length 46
15:13:05.071602 IP b.resolvers.level3.net.domain > programming-lab.52638: 25897 NXDomain* 0/1/1 (112)
15:13:05.072074 IP programming-lab.51667 > b.resolvers.level3.net.domain: 59975+ [1au] PTR? 41.70.10.10.in-addr.arpa. (53)
15:13:05.612489 IP programming-lab.40080 > b.resolvers.level3.net.domain: 41174+ [1au] PTR? 43.77.10.10.in-addr.arpa. (53)
15:13:05.654131 ARP, Request who-has 10.10.67.48 tell 10.10.1.69, length 46
15:13:05.654147 ARP, Request who-has 10.10.68.48 tell 10.10.1.69, length 46
15:13:05.654148 ARP, Request who-has 10.10.69.48 tell 10.10.1.69, length 46
15:13:05.654150 ARP, Request who-has 10.10.70.48 tell 10.10.1.69, length 46
15:13:05.654152 ARP, Request who-has 10.10.71.48 tell 10.10.1.69, length 46
15:13:05.654153 ARP, Request who-has 10.10.72.48 tell 10.10.1.69, length 46
15:13:05.654155 ARP, Request who-has 10.10.73.48 tell 10.10.1.69, length 46
15:13:05.654156 ARP, Request who-has 10.10.74.48 tell 10.10.1.69, length 46
15:13:05.654191 ARP, Request who-has 10.10.75.48 tell 10.10.1.69, length 46
15:13:05.654192 ARP, Request who-has 10.10.76.48 tell 10.10.1.69, length 46
15:13:05.671482 IP b.resolvers.level3.net.domain > programming-lab.40080: 41174 NXDomain* 0/1/1 (112)
15:13:05.671955 IP programming-lab.58041 > b.resolvers.level3.net.domain: 16307+ [1au] PTR? 43.78.10.10.in-addr.arpa. (53)
15:13:05.735369 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:13:05.747357 IP b.resolvers.level3.net.domain > programming-lab.58041: 16307 NXDomain* 0/1/1 (112)
15:13:05.747870 IP programming-lab.39326 > b.resolvers.level3.net.domain: 11182+ [1au] PTR? 43.79.10.10.in-addr.arpa. (53)
15:13:05.816317 IP b.resolvers.level3.net.domain > programming-lab.39326: 11182 NXDomain* 0/1/1 (112)
15:13:05.816863 IP programming-lab.49277 > b.resolvers.level3.net.domain: 511+ [1au] PTR? 44.64.10.10.in-addr.arpa. (53)
15:13:06.489121 IP programming-lab.36214 > b.resolvers.level3.net.domain: 11326+ [1au] PTR? 99.1.10.10.in-addr.arpa. (52)
15:13:06.498767 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:13:06.542610 IP 10.10.1.119.41549 > 255.255.255.255.29810: UDP, length 367
15:13:11.761442 IP programming-lab.55764 > dns.google.domain: 44392+ [1au] PTR? 45.73.10.10.in-addr.arpa. (53)
15:13:11.785353 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:13:11.849611 IP dns.google.domain > programming-lab.55764: 44392 NXDomain 0/0/1 (53)
15:13:11.850158 IP programming-lab.53937 > dns.google.domain: 7573+ [1au] PTR? 45.74.10.10.in-addr.arpa. (53)
15:13:11.866183 IP dns.google.domain > programming-lab.53937: 7573 NXDomain 0/0/1 (53)
15:13:11.866709 IP programming-lab.38266 > dns.google.domain: 7512+ [1au] PTR? 45.75.10.10.in-addr.arpa. (53)
15:13:11.886015 IP dns.google.domain > programming-lab.38266: 7512 NXDomain 0/0/1 (53)
15:13:11.886359 IP programming-lab.42339 > dns.google.domain: 51305+ [1au] PTR? 45.76.10.10.in-addr.arpa. (53)
15:13:11.886436 ARP, Request who-has 10.10.67.62 tell 10.10.1.69, length 46
15:13:11.886439 ARP, Request who-has 10.10.68.62 tell 10.10.1.69, length 46
15:13:11.886440 ARP, Request who-has 10.10.69.62 tell 10.10.1.69, length 46
15:13:11.886440 ARP, Request who-has 10.10.70.62 tell 10.10.1.69, length 46
15:13:11.886440 ARP, Request who-has 10.10.71.62 tell 10.10.1.69, length 46
15:13:11.886441 ARP, Request who-has 10.10.72.62 tell 10.10.1.69, length 46
15:13:11.886441 ARP, Request who-has 10.10.73.62 tell 10.10.1.69, length 46
15:13:11.886441 ARP, Request who-has 10.10.74.62 tell 10.10.1.69, length 46
15:13:11.886445 ARP, Request who-has 10.10.75.62 tell 10.10.1.69, length 46
15:13:11.886445 ARP, Request who-has 10.10.76.62 tell 10.10.1.69, length 46
15:13:11.905394 IP dns.google.domain > programming-lab.42339: 51305 NXDomain 0/0/1 (53)
15:13:11.905635 IP programming-lab.58139 > dns.google.domain: 50310+ [1au] PTR? 45.77.10.10.in-addr.arpa. (53)
15:13:11.925338 IP dns.google.domain > programming-lab.58139: 50310 NXDomain 0/0/1 (53)
15:13:11.925601 IP programming-lab.56365 > dns.google.domain: 65473+ [1au] PTR? 45.78.10.10.in-addr.arpa. (53)
15:13:11.946302 IP dns.google.domain > programming-lab.56365: 65473 NXDomain 0/0/1 (53)
15:13:11.946592 IP programming-lab.46877 > dns.google.domain: 39135+ [1au] PTR? 45.79.10.10.in-addr.arpa. (53)
15:13:12.116279 IP programming-lab.45510 > dns.google.domain: 12388+ [1au] PTR? 47.69.10.10.in-addr.arpa. (53)
15:13:12.163775 IP dns.google.domain > programming-lab.45510: 12388 NXDomain 0/0/1 (53)
15:13:12.164257 IP programming-lab.36243 > dns.google.domain: 24240+ [1au] PTR? 47.70.10.10.in-addr.arpa. (53)
15:13:12.185930 IP dns.google.domain > programming-lab.36243: 24240 NXDomain 0/0/1 (53)
15:13:12.186476 IP programming-lab.46720 > dns.google.domain: 10349+ [1au] PTR? 47.71.10.10.in-addr.arpa. (53)
15:13:12.229437 IP dns.google.domain > programming-lab.46720: 10349 NXDomain 0/0/1 (53)
15:13:12.229973 IP programming-lab.35304 > dns.google.domain: 47997+ [1au] PTR? 47.72.10.10.in-addr.arpa. (53)
15:13:12.252667 IP dns.google.domain > programming-lab.35304: 47997 NXDomain 0/0/1 (53)
15:13:12.253122 IP programming-lab.49789 > dns.google.domain: 5865+ [1au] PTR? 47.73.10.10.in-addr.arpa. (53)
15:13:12.288479 ARP, Request who-has 10.10.65.63 tell 10.10.1.69, length 46
15:13:12.288490 ARP, Request who-has 10.10.66.63 tell 10.10.1.69, length 46
15:13:12.288492 ARP, Request who-has 10.10.67.63 tell 10.10.1.69, length 46
15:13:12.288494 ARP, Request who-has 10.10.68.63 tell 10.10.1.69, length 46
15:13:12.288495 ARP, Request who-has 10.10.69.63 tell 10.10.1.69, length 46
15:13:12.288498 ARP, Request who-has 10.10.70.63 tell 10.10.1.69, length 46
15:13:12.288498 ARP, Request who-has 10.10.71.63 tell 10.10.1.69, length 46
15:13:12.288522 ARP, Request who-has 10.10.72.63 tell 10.10.1.69, length 46
15:13:12.288523 ARP, Request who-has 10.10.73.63 tell 10.10.1.69, length 46
15:13:12.288523 ARP, Request who-has 10.10.74.63 tell 10.10.1.69, length 46
15:13:22.633641 IP programming-lab.46272 > b.resolvers.level3.net.domain: 12439+ [1au] PTR? 48.67.10.10.in-addr.arpa. (53)
15:13:22.633667 IP programming-lab.57731 > dns.google.domain: 19111+ [1au] PTR? 47.78.10.10.in-addr.arpa. (53)
15:13:22.722206 IP b.resolvers.level3.net.domain > programming-lab.46272: 12439 NXDomain* 0/1/1 (112)
15:13:22.722769 IP programming-lab.52322 > dns.google.domain: 49167+ [1au] PTR? 48.68.10.10.in-addr.arpa. (53)
15:13:28.562120 IP programming-lab.54520 > b.resolvers.level3.net.domain: 16737+ [1au] PTR? 62.67.10.10.in-addr.arpa. (53)
15:13:28.568225 ARP, Request who-has 10.10.65.98 tell 10.10.1.69, length 46
15:13:28.568239 ARP, Request who-has 10.10.66.98 tell 10.10.1.69, length 46
15:13:28.568241 ARP, Request who-has 10.10.67.98 tell 10.10.1.69, length 46
15:13:28.568243 ARP, Request who-has 10.10.68.98 tell 10.10.1.69, length 46
15:13:28.568244 ARP, Request who-has 10.10.69.98 tell 10.10.1.69, length 46
15:13:28.568246 ARP, Request who-has 10.10.70.98 tell 10.10.1.69, length 46
15:13:28.568247 ARP, Request who-has 10.10.71.98 tell 10.10.1.69, length 46
15:13:28.568249 ARP, Request who-has 10.10.72.98 tell 10.10.1.69, length 46
15:13:28.568276 ARP, Request who-has 10.10.73.98 tell 10.10.1.69, length 46
15:13:28.568278 ARP, Request who-has 10.10.74.98 tell 10.10.1.69, length 46
15:13:28.769421 ARP, Request who-has 10.10.79.98 tell 10.10.1.69, length 46
15:13:28.769437 ARP, Request who-has 10.10.64.99 tell 10.10.1.69, length 46
15:13:28.769439 ARP, Request who-has 10.10.65.99 tell 10.10.1.69, length 46
15:13:28.769440 ARP, Request who-has 10.10.66.99 tell 10.10.1.69, length 46
15:13:28.769442 ARP, Request who-has 10.10.67.99 tell 10.10.1.69, length 46
15:13:28.769443 ARP, Request who-has 10.10.68.99 tell 10.10.1.69, length 46
15:13:28.769445 ARP, Request who-has 10.10.69.99 tell 10.10.1.69, length 46
15:13:28.769447 ARP, Request who-has 10.10.70.99 tell 10.10.1.69, length 46
15:13:28.769484 ARP, Request who-has 10.10.71.99 tell 10.10.1.69, length 46
15:13:28.769486 ARP, Request who-has 10.10.72.99 tell 10.10.1.69, length 46
15:13:28.918924 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:13:28.970290 ARP, Request who-has 10.10.79.98 tell 10.10.1.69, length 46
15:13:28.970306 ARP, Request who-has 10.10.64.99 tell 10.10.1.69, length 46
15:13:28.970308 ARP, Request who-has 10.10.65.99 tell 10.10.1.69, length 46
15:13:28.970309 ARP, Request who-has 10.10.66.99 tell 10.10.1.69, length 46
15:13:28.970311 ARP, Request who-has 10.10.67.99 tell 10.10.1.69, length 46
15:13:28.970313 ARP, Request who-has 10.10.68.99 tell 10.10.1.69, length 46
15:13:28.970314 ARP, Request who-has 10.10.69.99 tell 10.10.1.69, length 46
15:13:28.970316 ARP, Request who-has 10.10.70.99 tell 10.10.1.69, length 46
15:13:28.970348 ARP, Request who-has 10.10.71.99 tell 10.10.1.69, length 46
15:13:28.970349 ARP, Request who-has 10.10.72.99 tell 10.10.1.69, length 46
15:13:29.171281 ARP, Request who-has 10.10.77.99 tell 10.10.1.69, length 46
15:13:29.171297 ARP, Request who-has 10.10.78.99 tell 10.10.1.69, length 46
15:13:29.171299 ARP, Request who-has 10.10.79.99 tell 10.10.1.69, length 46
15:13:29.171300 ARP, Request who-has 10.10.64.100 tell 10.10.1.69, length 46
15:13:29.171302 ARP, Request who-has 10.10.65.100 tell 10.10.1.69, length 46
15:13:29.171303 ARP, Request who-has 10.10.66.100 tell 10.10.1.69, length 46
15:13:29.171305 ARP, Request who-has 10.10.67.100 tell 10.10.1.69, length 46
15:13:29.171307 ARP, Request who-has 10.10.68.100 tell 10.10.1.69, length 46
15:13:29.171341 ARP, Request who-has 10.10.69.100 tell 10.10.1.69, length 46
15:13:29.171341 ARP, Request who-has 10.10.70.100 tell 10.10.1.69, length 46
15:13:39.442453 IP programming-lab.60470 > b.resolvers.level3.net.domain: 7016+ [1au] PTR? 63.65.10.10.in-addr.arpa. (53)
15:13:39.506782 IP b.resolvers.level3.net.domain > programming-lab.60470: 7016 NXDomain* 0/1/1 (112)
15:13:39.507343 IP programming-lab.47786 > b.resolvers.level3.net.domain: 15988+ [1au] PTR? 63.66.10.10.in-addr.arpa. (53)
15:13:39.581051 IP b.resolvers.level3.net.domain > programming-lab.47786: 15988 NXDomain* 0/1/1 (112)
15:13:39.581659 IP programming-lab.39849 > b.resolvers.level3.net.domain: 41921+ [1au] PTR? 63.67.10.10.in-addr.arpa. (53)
15:13:39.618704 ARP, Request who-has 10.10.73.122 tell 10.10.1.69, length 46
15:13:39.618720 ARP, Request who-has 10.10.74.122 tell 10.10.1.69, length 46
15:13:39.618722 ARP, Request who-has 10.10.75.122 tell 10.10.1.69, length 46
15:13:39.618724 ARP, Request who-has 10.10.76.122 tell 10.10.1.69, length 46
15:13:39.618725 ARP, Request who-has 10.10.77.122 tell 10.10.1.69, length 46
15:13:39.618727 ARP, Request who-has 10.10.78.122 tell 10.10.1.69, length 46
15:13:39.618729 ARP, Request who-has 10.10.79.122 tell 10.10.1.69, length 46
15:13:39.618730 ARP, Request who-has 10.10.64.123 tell 10.10.1.69, length 46
15:13:39.618747 ARP, Request who-has 10.10.65.123 tell 10.10.1.69, length 46
15:13:39.618749 ARP, Request who-has 10.10.66.123 tell 10.10.1.69, length 46
15:13:40.312309 IP programming-lab.36177 > b.resolvers.level3.net.domain: 9988+ [1au] PTR? 98.65.10.10.in-addr.arpa. (53)
15:13:40.422228 ARP, Request who-has 10.10.69.124 tell 10.10.1.69, length 46
15:13:40.422244 ARP, Request who-has 10.10.70.124 tell 10.10.1.69, length 46
^C15:13:40.422246 ARP, Request who-has 10.10.71.124 tell 10.10.1.69, length 46

450 packets captured
5356 packets received by filter
4831 packets dropped by kernel
mtech@programming-lab:~$ 


