provider "aws" {
  version = "3.0"
  region = "us-east-1"
}


variable "instance_count" {
  type = number
}


resource "aws_instance" "my_instance" {
  ami = "ami-123456"
  instance_type = "t2.micro"
}


output "instance_ip" {
  value = aws_instance.my_instance.public_ip
}

