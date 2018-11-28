#!/usr/bin/python
# File: legacy_router.py

from mininet.net import Mininet
from mininet.node import Host, Node
from mininet.cli import CLI
from mininet.log import setLogLevel, info

def myNetwork():

	defaultIP='10.0.1.1/24'
    net = Mininet( topo=None,build=False)

    info( '*** Adding controller\n' )
    info( '*** Add switches\n')
    r1= net.addHost('r0', cls=Node, ip=defaultIP)
    r1.cmd('sysctl -w net.ipv4.ip_forward=1')

    info( '*** Add hosts\n')
    h1 = net.addHost('h1', cls=Host, ip='10.0.1.100/24', defaultRoute='via 10.0.1.1')
    h2 = net.addHost('h2', cls=Host, ip='172.16.0.100/12', defaultRoute='via 172.16.0.1')

    info( '*** Add links\n')
    net.addLink(h1, r1,intfName2='r0-eth1', params2={'ip' : '10.0.1.1/24'})
    net.addLink(h2, r1,intfName2='r0-eth2', params2={'ip' : '172.16.0.1/12'})

    info( '*** Starting network\n')
    net.build()
    
    CLI(net)
    net.stop()

if __name__ == '__main__':
    setLogLevel( 'info' )
    myNetwork()

