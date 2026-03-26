HP@DESKTOP-BE9J5N9 MINGW64 /c/apache benchmark/Apache24/bin
$ ab -n 300 -c 100 -m GET http://localhost:9099/customerReports/WESTIND
This is ApacheBench, Version 2.3 <$Revision: 1923142 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Finished 300 requests


Server Software:
Server Hostname:        localhost
Server Port:            9099

Document Path:          /customerReports/WESTIND
Document Length:        36 bytes

Concurrency Level:      100
Time taken for tests:   2.082 seconds
Complete requests:      300
Failed requests:        0
Total transferred:      48300 bytes
HTML transferred:       10800 bytes
Requests per second:    144.10 [#/sec] (mean)
Time per request:       693.981 [ms] (mean)
Time per request:       6.940 [ms] (mean, across all concurrent requests)
Transfer rate:          22.66 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.4      0       2
Processing:    40  485 259.3    442    1238
Waiting:       40  484 259.4    442    1237
Total:         40  485 259.3    442    1238

Percentage of the requests served within a certain time (ms)
  50%    442
  66%    553
  75%    697
  80%    712
  90%    814
  95%    960
  98%   1109
  99%   1141
 100%   1238 (longest request)

HP@DESKTOP-BE9J5N9 MINGW64 /c/apache benchmark/Apache24/bin
$ ab -n 300 -c 100 -m GET http://localhost:9099/customerReports/platform/WESTIND
This is ApacheBench, Version 2.3 <$Revision: 1923142 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Finished 300 requests


Server Software:
Server Hostname:        localhost
Server Port:            9099

Document Path:          /customerReports/platform/WESTIND
Document Length:        36 bytes

Concurrency Level:      100
Time taken for tests:   0.160 seconds
Complete requests:      300
Failed requests:        0
Total transferred:      48300 bytes
HTML transferred:       10800 bytes
Requests per second:    1869.95 [#/sec] (mean)
Time per request:       53.477 [ms] (mean)
Time per request:       0.535 [ms] (mean, across all concurrent requests)
Transfer rate:          294.01 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.4      0       1
Processing:     4   23   6.6     23      89
Waiting:        4   18   7.6     18      70
Total:          4   23   6.6     23      89

Percentage of the requests served within a certain time (ms)
  50%     23
  66%     25
  75%     26
  80%     28
  90%     30
  95%     31
  98%     37
  99%     40
 100%     89 (longest request)

HP@DESKTOP-BE9J5N9 MINGW64 /c/apache benchmark/Apache24/bin
$ ab -n 300 -c 100 -m GET http://localhost:9099/customerReports/platform/executor_service/WESTIND
This is ApacheBench, Version 2.3 <$Revision: 1923142 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Finished 300 requests


Server Software:
Server Hostname:        localhost
Server Port:            9099

Document Path:          /customerReports/platform/executor_service/WESTIND
Document Length:        36 bytes

Concurrency Level:      100
Time taken for tests:   0.093 seconds
Complete requests:      300
Failed requests:        0
Total transferred:      48300 bytes
HTML transferred:       10800 bytes
Requests per second:    3233.14 [#/sec] (mean)
Time per request:       30.930 [ms] (mean)
Time per request:       0.309 [ms] (mean, across all concurrent requests)
Transfer rate:          508.34 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.3      0       1
Processing:     6   24   7.1     23      36
Waiting:        3   16   7.5     15      32
Total:          6   24   7.1     23      36

Percentage of the requests served within a certain time (ms)
  50%     23
  66%     29
  75%     32
  80%     33
  90%     34
  95%     35
  98%     36
  99%     36
 100%     36 (longest request)

HP@DESKTOP-BE9J5N9 MINGW64 /c/apache benchmark/Apache24/bin
$ ab -n 300 -c 100 -m GET http://localhost:9099/customerReports/virtualthreads/WESTIND
This is ApacheBench, Version 2.3 <$Revision: 1923142 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Finished 300 requests


Server Software:
Server Hostname:        localhost
Server Port:            9099

Document Path:          /customerReports/virtualthreads/WESTIND
Document Length:        36 bytes

Concurrency Level:      100
Time taken for tests:   0.571 seconds
Complete requests:      300
Failed requests:        0
Total transferred:      48300 bytes
HTML transferred:       10800 bytes
Requests per second:    525.76 [#/sec] (mean)
Time per request:       190.201 [ms] (mean)
Time per request:       1.902 [ms] (mean, across all concurrent requests)
Transfer rate:          82.66 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.4      0       2
Processing:    15  125 201.2     21     521
Waiting:        2  119 204.5     13     521
Total:         15  125 201.2     21     521

Percentage of the requests served within a certain time (ms)
  50%     21
  66%     23
  75%     24
  80%    508
  90%    511
  95%    513
  98%    517
  99%    518
 100%    521 (longest request)

HP@DESKTOP-BE9J5N9 MINGW64 /c/apache benchmark/Apache24/bin
$ ab -n 300 -c 100 -m GET http://localhost:9099/customerReports/virtualthreadspertaskexecutor/WESTIND
This is ApacheBench, Version 2.3 <$Revision: 1923142 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Finished 300 requests


Server Software:
Server Hostname:        localhost
Server Port:            9099

Document Path:          /customerReports/virtualthreadspertaskexecutor/WESTIND
Document Length:        36 bytes

Concurrency Level:      100
Time taken for tests:   0.190 seconds
Complete requests:      300
Failed requests:        0
Total transferred:      48300 bytes
HTML transferred:       10800 bytes
Requests per second:    1578.33 [#/sec] (mean)
Time per request:       63.358 [ms] (mean)
Time per request:       0.634 [ms] (mean, across all concurrent requests)
Transfer rate:          248.16 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.4      0       2
Processing:    11   56  49.9     27     177
Waiting:        1   55  50.6     25     177
Total:         11   56  49.9     27     177

Percentage of the requests served within a certain time (ms)
  50%     27
  66%     50
  75%    118
  80%    121
  90%    127
  95%    154
  98%    158
  99%    167
 100%    177 (longest request)